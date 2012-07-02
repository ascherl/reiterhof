import java.util.ArrayList;


public class Dialog {
	void toString(ArrayList<Paar> Paare) {
		for(int i = 0; i < Paare.size(); i++){
			System.out.println( Paare.get(i).getReiter().getName() + " reitet " + Paare.get(i).getPferd().getName() + "!" );
		}
	}
}
