import java.util.ArrayList;


public class Reiterhof {
	private ArrayList<Reiter> ReiterListe;
	private ArrayList<Pferd> PferdeListe;

	Reiterhof(ArrayList<Reiter> ReiterListe, ArrayList<Pferd> Pferde) {
		ArrayList<Reiter> this.ReiterListe = ReiterListe;
		ArrayList<Pferd> this.PferdeListe = Pferde;
	}
	
	public ArrayList<Reiter> zuordnen() {
		
		for(int i = 1; i <= ReiterListe.size(); i++)
		{
			if(ReiterListe.get(i).getWuensche().size() == 1)
			{
				setPaar();
			}
		}
		return ;
	}
}
