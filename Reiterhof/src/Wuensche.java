/**
 * Klasse, die Wuensche eines Reiters speichert.
 * @author rudi
 *
 */
public class Wuensche {
	boolean[] gewuenscht;

	/**
	 * @param wuensche Pferde als Integern
	 * @param pferdeZahl Anzahl an Pferden auf dem Hof
	 */
	Wuensche(int[] wuensche,int pferdeZahl) {
		this.gewuenscht = new boolean[pferdeZahl];
		
		for(int j = 0; j < gewuenscht.length; j++)
		{
			gewuenscht[j] = false;
		}
		
		for(int i = 0; i < wuensche.length; i++)
		{
			gewuenscht[wuensche[i]]=true;
		}
		
	/*	for(int i = 0; i < pferdeZahl; i++)
		{

				if(i == wuensche[j])
				{
					this.gewuenscht[i] = true;
					j++;
				}
				else
				{
					this.gewuenscht[i] = false;
				}
		}
		*/
	}
}
