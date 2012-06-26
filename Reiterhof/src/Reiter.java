import java.util.ArrayList;


public class Reiter {
	
	private String name;
	private ArrayList<Pferd> wuensche;
	private int koennen;
	
	Reiter(String name, ArrayList<Pferd> Wuensche, int koennen) {
		this.name = name;
		this.wuensche = Wuensche;
		this.koennen = koennen;
	}

	public String getName() {
		return name;
	}

	public int getKoennen() {
		return koennen;
	}
	
	public ArrayList<Pferd> getWuensche() {
		return this.wuensche;
	}
	
}
