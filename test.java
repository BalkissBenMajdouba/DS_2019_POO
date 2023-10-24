package ds2019;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courrier c1= new Courrier(true, "Rue Marrakech");
		c1.decrire();
		
		System.out.println();
		Lettre l1= new Lettre(true, "Rue l'independance", 100, "A3");
		l1.decrire();
		
		System.out.println();
		Colis col1= new Colis(false, "Nabeul", 120, 1);
		col1.decrire();
		
		
		System.out.println("---------------------------------------------------------------");
		
		BoiteCourrier boite= new BoiteCourrier();
		
		boite.TabC[0]=c1;
		boite.TabC[1]=l1;
		boite.TabC[2]=col1;
		
		boite.afficher();
		System.out.println();
		System.out.println("mt total: "+boite.affranchir());
		System.out.println();
		System.out.println("Courriers invalides : "+boite.courriersInvalides());
			
		}
		

}
