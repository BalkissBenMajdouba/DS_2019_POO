package ds2019;

public class BoiteCourrier {
	Courrier[] TabC = new Courrier[3];
	
	
	double affranchir() {
		double montant=0;
		for(int i=0;i<TabC.length;i++) {
			montant+=TabC[i].affranchir();
		}
		return montant;
	}
	double  courriersInvalides() {
		int invalide = 0;
		for(int i=0;i<TabC.length;i++) {
			if(TabC[i].estValide()==true) {
				invalide+=1;
			}
		}
		return invalide;
		
	}
	
	void afficher() {
		for(int i=0;i<TabC.length;i++) {
			TabC[i].decrire();
			if(TabC[i].estValide()==false) {
				System.out.println("non valide ! ");
			}
		}
	}
		
	

}
