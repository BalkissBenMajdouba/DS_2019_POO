package ds2019;

public class Courrier {
	protected boolean modeE;
	protected String adressDest;
	protected final double tarifBaseCourrier=0.5;
	
	public Courrier (boolean modeE,String adressDest) {
		this.adressDest=adressDest;
		this.modeE=modeE;
	}
	
	public boolean estValide() {
		if (this.adressDest.length()>0) {
			return true;
		}
		else return false;
	}
	public void decrire() {
		System.out.println(getClass().getSimpleName()+" est caracterise par : un mode d’expedition : "+ modeE+ " et une adresse de destination :"+adressDest+ " un tarif : "+ this.affranchir());
	}
	public double affranchir() {
		
		if(this.modeE==false && estValide()) {
			return tarifBaseCourrier;
		}
		else if (this.modeE==true && estValide()) {
			return (tarifBaseCourrier*2);
		}
		else 
			return 0;
			
	}
	
}
