public class Reiter {
	
	private String name;
	private String[] wuensche;
	private int koennen;
	
	Reiter(String name, String[] wuensche, int koennen) {
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
	
	public String[] getWuensche() {
		return this.wuensche;
	}
	
}
