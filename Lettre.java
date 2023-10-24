package ds2019;

public class Lettre extends Courrier{
	private double poids;
	private String format;
	
	public Lettre(boolean modeE,String adressDest, double poids,String format) {
		super(modeE,adressDest);
		this.poids=poids;
		this.format=format;
		
	}
	@Override
	public void decrire() {
		super.decrire();
		System.out.println(" son poids (en grammes): "+poids+" son format: "+format);
	}
	
	@Override 
	public double affranchir() {
		double montant=0;
		double tarifBase=0;
		if(super.estValide()) {
			if(this.format.toUpperCase().equals("A4")) {
				 tarifBase=2.5;
			}
			else if (this.format.toUpperCase().equals("A3")) {
				 tarifBase=3.5;
			}
			montant=tarifBase+0.5*(this.poids*0.001);
		}
		if(super.modeE==true) {
			
			montant=montant*2;
		}
		return montant;
	}
	

}
