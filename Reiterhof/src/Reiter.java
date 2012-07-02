public class Reiter {
	
	private String name;
	private Wuensche wuensche;
	private int koennen;
	
	Reiter(String name, Wuensche wuensche, int koennen) {
		this.name = name;
		this.wuensche = wuensche;
		this.koennen = koennen;
	}

	public String getName() {
		return name;
	}

	public int getKoennen() {
		return koennen;
	}
	
	public Wuensche getWuensche() {
		return this.wuensche;
	}
	
}
