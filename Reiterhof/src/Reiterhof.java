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
		zuordnen(ReiterListe, PferdeListe, Paare, true);
		Dialog dialog = new Dialog();
		dialog.toString(Paare);
		System.out.println("\n\n\n");
	}
	
	private boolean zuordnen(ArrayList<Reiter> ReiterListe, ArrayList<Pferd> PferdeListe, ArrayList<Paar> Paare, boolean beachteWunsch) {
		// alle Pferde oder Reiter verteilt?
		if (ReiterListe.size() == 0 || PferdeListe.size() == 0) {
			return true;
		}
		
		for (int i=0; i < ReiterListe.size(); i++) {
			for (int j=0; j < PferdeListe.size(); j++) {
				// passen Reiter und Pferd zueinander?
				if (ReiterListe.get(i).getKoennen() >= PferdeListe.get(j).getKoennen()) {
					Reiter reiter = ReiterListe.remove(i);
					Pferd pferd = PferdeListe.remove(j);
					
					// Ist das Pferd das Wunschpferd?
					boolean wunschPferd = istWunschPferd(reiter.getWuensche(), pferd.getName());
					
					// wenn der Wunsch beachtet werden soll, dann nur Wunschpferde zulassen
					// beachteWunsch == TRUE, wunschPferd == TRUE => TRUE
					// beachteWunsch == TRUE, wunschPferd == FALSE => FALSE 
					// beachteWunsch == FALSE, wunschPferd == TRUE => TRUE
					// beachteWunsch == FALSE, wunschPferd == FALSE => TRUE
					boolean zuordnungProbieren = (!beachteWunsch || wunschPferd);
					
					if (zuordnungProbieren) {
						// versuche erst den Wunsch zu beachten
						if (zuordnen(ReiterListe, PferdeListe, Paare, true) || 
							zuordnen(ReiterListe, PferdeListe, Paare, false)) {
							
							// Zuordnung gefunden
							Paar paar = new Paar(reiter, pferd);
							Paare.add(paar);
							return true;
						}
					}
					
					// keine Lsg gefunden? Ausgangssituation herstellen
					ReiterListe.add(i, reiter);
					PferdeListe.add(j, pferd);
				}
			}
		}
		
		return false;
	}
	
	private boolean istWunschPferd(String[] wuensche, String name) {
		for (int i=0; i < wuensche.length; i++) {
			if (wuensche[i] == name) {
				return true;
			}
		}
		return false;
	}
}