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
		
		int[] gewuenscht_anja = {0,1,3,5,};
		Wuensche wuensche_anja = new Wuensche(gewuenscht_anja,PferdeListe.size());
		ReiterListe.add(new Reiter("Anja", wuensche_anja ,0));
		
		int[] gewuenscht_bertram = {0,1,2,3,4,5,6,7,8,};
		Wuensche wuensche_bertram = new Wuensche(gewuenscht_bertram,PferdeListe.size());
		ReiterListe.add(new Reiter("Bertram",wuensche_bertram,1));
		
		int[] gewuenscht_christa = {2,};
		Wuensche wuensche_christa = new Wuensche(gewuenscht_christa,PferdeListe.size());
		ReiterListe.add(new Reiter("Christa",wuensche_christa,2));
		
		int[] gewuenscht_doris = {0,3,6,};
		Wuensche wuensche_doris = new Wuensche(gewuenscht_doris,PferdeListe.size());
		ReiterListe.add(new Reiter("Doris",wuensche_doris,0));
	
		int[] gewuenscht_emil = {0,1,2,3,4,5,6,7,8,};
		Wuensche wuensche_emil = new Wuensche(gewuenscht_emil,PferdeListe.size());
		ReiterListe.add(new Reiter("Emil",wuensche_emil,0));
		
		int[] gewuenscht_fritz = {2,6,};
		Wuensche wuensche_fritz = new Wuensche(gewuenscht_fritz,PferdeListe.size());
		ReiterListe.add(new Reiter("Fritz",wuensche_fritz,2));
		
		int[] gewuenscht_gabi = {0,2,4,6,};
		Wuensche wuensche_gabi = new Wuensche(gewuenscht_gabi,PferdeListe.size());
		ReiterListe.add(new Reiter("Gabi",wuensche_gabi,1));
		
		
		Reiterhof Reiterhof = new Reiterhof(ReiterListe, PferdeListe);

		Reiterhof.zuordnen();
		
	}

}
