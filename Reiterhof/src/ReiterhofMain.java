import java.util.*;

public class ReiterhofMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Pferd> PferdeListe = new ArrayList<Pferd>();
			
		Pferd anex = new Pferd("Anex",0);
			PferdeListe.add(anex);
		Pferd nicki = new Pferd("Nicki",1);
			PferdeListe.add(nicki);
		Pferd hurrikan = new Pferd("Hurrikan",1);
			PferdeListe.add(hurrikan);
		Pferd pucki = new Pferd("Pucki",0);
			PferdeListe.add(pucki);
		Pferd tornado = new Pferd("Tornado",2);
			PferdeListe.add(tornado);
		Pferd wittchen = new Pferd("Wittchen",0);
			PferdeListe.add(wittchen);
		Pferd sturmwind = new Pferd("Sturmwind",1);
			PferdeListe.add(sturmwind);
		Pferd zausel = new Pferd("Zausel",0);
			PferdeListe.add(zausel);
		Pferd zickkack = new Pferd("Zickzack",2);
			PferdeListe.add(zickkack);
		
		
		ArrayList<Reiter> ReiterListe = new ArrayList<Reiter>();
		
		String[] gewuenscht_anja = {"Nicki", "Pucki", "Wittchen", "Anex"};
		ReiterListe.add(new Reiter("Anja", gewuenscht_anja, 0));
		
		String[] gewuenscht_bertram = {"Anex", "Nicki", "Hurrikan", "Pucki", "Tornado", "Wittchen", "Sturmwind", "Zausel", "Zickzack"};
		ReiterListe.add(new Reiter("Bertram", gewuenscht_bertram, 1));
		
		String[] gewuenscht_christa = {"Hurrikan"};
		ReiterListe.add(new Reiter("Christa", gewuenscht_christa, 2));
		
		String[] gewuenscht_doris = {"Anex", "Pucki", "Wittchen"};
		ReiterListe.add(new Reiter("Doris", gewuenscht_doris, 0));
	
		String[] gewuenscht_emil = {"Anex", "Nicki", "Hurrikan", "Pucki", "Tornado", "Wittchen", "Sturmwind", "Zausel", "Zickzack"};
		ReiterListe.add(new Reiter("Emil", gewuenscht_emil, 0));
		
		String[] gewuenscht_fritz = {"Hurrikan", "Sturmwind"};
		ReiterListe.add(new Reiter("Fritz", gewuenscht_fritz, 2));
		
		String[] gewuenscht_gabi = {"Anex", "Hurrikan", "Tornado", "Sturmwind", "Zausel"};
		ReiterListe.add(new Reiter("Gabi", gewuenscht_gabi, 1));
		
		
		Reiterhof Reiterhof = new Reiterhof(ReiterListe, PferdeListe);

		Reiterhof.zuordnen();
		
	}

}
