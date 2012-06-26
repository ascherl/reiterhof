public class Paar {

	private Pferd Pferd;
	private Reiter Reiter;
	
	public Paar(Reiter Reiter, Pferd Pferd){
		this.Pferd = Pferd;
		this.Reiter = Reiter;
	}
	
	public Reiter getReiter() {
		return this.Reiter;
	}
	
	public Pferd getPferd() {
		return this.Pferd;
	}
	
}
