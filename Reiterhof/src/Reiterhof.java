import java.util.ArrayList;


public class Reiterhof {
	private ArrayList<Reiter> ReiterListe;
	private ArrayList<Pferd> PferdeListe;
	private ArrayList<Paar> Paare; 

	Reiterhof(ArrayList<Reiter> ReiterListe, ArrayList<Pferd> Pferde) {
		this.ReiterListe = ReiterListe;
		this.PferdeListe = Pferde;
		this.Paare = new ArrayList<Paar>();
	}
	
	public void zuordnen() {
		for(int i = 0; i < ReiterListe.size(); i++)
		{
			if(ReiterListe.get(i).getWuensche().size() == 1) 
			{
				
				if(ReiterListe.get(i).getKoennen() >= ReiterListe.get(i).getWuensche().get(0).getKoennen())
				{
					System.out.println("Yeah.");
					Paar paar = new Paar(ReiterListe.get(i), ReiterListe.get(i).getWuensche().get(0));
					Paare.add(paar);
					PferdeListe.remove(PferdeListe.indexOf(ReiterListe.get(i).getWuensche().get(0)));
			//		for(int j = 1; j <= ReiterListe.size(); j++){}
				}
			}
		}

		Dialog dialog = new Dialog();
		dialog.toString(Paare);
	}
}
