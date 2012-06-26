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
		
		ArrayList<Pferd> wuensche_anja = new ArrayList<Pferd>();
			wuensche_anja.add(nicki);
			wuensche_anja.add(pucki);
			wuensche_anja.add(anex);
			wuensche_anja.add(wittchen);
		ReiterListe.add(new Reiter("Anja",wuensche_anja,0));
		
		ArrayList<Pferd> wuensche_bertram = new ArrayList<Pferd>();
		ReiterListe.add(new Reiter("Bertram",wuensche_bertram,1));
		
		ArrayList<Pferd> wuensche_christa = new ArrayList<Pferd>();
			wuensche_christa.add(hurrikan);
		ReiterListe.add(new Reiter("Christa",wuensche_christa,2));
		
		ArrayList<Pferd> wuensche_doris = new ArrayList<Pferd>();
			wuensche_doris.add(anex);
			wuensche_doris.add(wittchen);
			wuensche_doris.add(pucki);
		ReiterListe.add(new Reiter("Doris",wuensche_doris,0));
		
		ArrayList<Pferd> wuensche_emil = PferdeListe;
		ReiterListe.add(new Reiter("Emil",wuensche_emil,0));
		
		ArrayList<Pferd> wuensche_fritz = new ArrayList<Pferd>();
			wuensche_fritz.add(sturmwind);
			wuensche_fritz.add(hurrikan);
		ReiterListe.add(new Reiter("Fritz",wuensche_fritz,2));
		
		ArrayList<Pferd> wuensche_gabi = new ArrayList<Pferd>();
			wuensche_gabi.add(hurrikan);
			wuensche_gabi.add(anex);
			wuensche_gabi.add(tornado);
			wuensche_gabi.add(sturmwind);
		ReiterListe.add(new Reiter("Gabi",wuensche_gabi,1));
		
		Reiterhof Reiterhof = new Reiterhof(ReiterListe, PferdeListe);
		
		Reiterhof.zuordnen();
		
	}

}
