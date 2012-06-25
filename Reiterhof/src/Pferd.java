
public class Pferd {
	
	private String name;
	private int koennen;
	
	Pferd(String name, int koennen) {
		this.setName(name);
		this.setKoennen(koennen);
	}

	public int getKoennen() {
		return koennen;
	}

	public void setKoennen(int koennen) {
		this.koennen = koennen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
