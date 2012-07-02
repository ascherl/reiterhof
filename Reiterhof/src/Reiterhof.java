import java.util.ArrayList;


public class Reiterhof {
	private ArrayList<Reiter> ReiterListe;
	private ArrayList<Pferd> PferdeListe;
	private ArrayList<Paar> Paare;
	private boolean[] verfuegbar;

	Reiterhof(ArrayList<Reiter> ReiterListe, ArrayList<Pferd> Pferde) {
		this.ReiterListe = ReiterListe;
		this.PferdeListe = Pferde;
		this.Paare = new ArrayList<Paar>();
		this.verfuegbar = new boolean[PferdeListe.size()];
		for (int i = 0; i < PferdeListe.size(); i ++) this.verfuegbar[i] = true;
	}
	
	public void zuordnen() {
		for(int i = 0; i < ReiterListe.size(); i++)
		{
			for(int j = 0; j < PferdeListe.size(); j++)
			{
				if(ReiterListe.get(i).getKoennen() < PferdeListe.get(j).getKoennen())
				{
					ReiterListe.get(i).getWuensche().gewuenscht[j] = false;
				}
			}
		}
		zuordnen(ReiterListe);
	}
	
	public void zuordnen(ArrayList<Reiter> ReiterListe) {
		if(ReiterListe.size() == 0){
			Dialog dialog = new Dialog();
			dialog.toString(Paare);
		}
		else
		{
			for(int i = 0; i < ReiterListe.size(); i++)
			{
				Reiter aktuellerReiter = ReiterListe.get(i);
				
				for(int j = 0; j < PferdeListe.size(); j++)
				{
					if( verfuegbar[j] == true && aktuellerReiter.getWuensche().gewuenscht[j] == true )
					{
						Paar paar = new Paar(aktuellerReiter,PferdeListe.get(j));
						Paare.add(paar);
						verfuegbar[j] = false;
						ReiterListe.remove(i);
						zuordnen(ReiterListe);
					}
					else 
					{
						//TODO Bessere ELSE-Bedingung?! 
					}
				}
			}
		}
	}
}


	/**	for(int i = 0; i < ReiterListe.size(); i++)
		{
			if(ReiterListe.get(i).getWuensche().size() == k) 
			{
				
				if(ReiterListe.get(i).getKoennen() >= ReiterListe.get(i).getWuensche().get(0).getKoennen())
				{
					System.out.println("Yeah.");
					Paar paar = new Paar(ReiterListe.get(i), ReiterListe.get(i).getWuensche().get(0));
					Paare.add(paar);
					PferdeListe.remove(PferdeListe.indexOf(ReiterListe.get(i).getWuensche().get(0)));
					for (int b = 0; b < PferdeListe.size(); b++) System.out.println(PferdeListe.get(b).getName());
					System.out.println();
			//		for(int j = 1; j <= ReiterListe.size(); j++){}
				}
			}
		}
		
		Dialog dialog = new Dialog();
		dialog.toString(Paare);
		
		while(PferdeListe.size() > laenge) zuordnen(k++);
		}
	 */