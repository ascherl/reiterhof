
public class Wuensche {
	boolean[] gewuenscht;
	
	Wuensche(int[] wuensche,int pferdeZahl) {
		int j = 0;
		this.gewuenscht = new boolean[pferdeZahl];
		for(int i = 0; i < pferdeZahl; i++)
		{
			while(j < wuensche.length)
			{
			if(i == wuensche[j]){
				this.gewuenscht[i] = true;
				j++;
			}
			else this.gewuenscht[i] = false;
			}
		}
	}
}
