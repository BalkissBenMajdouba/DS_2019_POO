package ds2019;

public class Colis extends Courrier {
	private double poids;
	private double volume;
	
	public Colis(boolean modeE,String adressDest, double poids,double volume) {
		super(modeE,adressDest);
		this.poids=poids;
		this.volume=volume;
		
	}
	@Override
	public void decrire() {
		super.decrire();
		System.out.println(" son poids (en grammes): "+poids+" son volume : "+volume);
	}
	

	@Override 
	public double affranchir() {
		
		double montant=0;
	
		if(super.estValide()) {
			montant=0.25*volume+poids*1.0;
	}
		return montant;
	}
	}
