package co.simplon.peoples;
//import co.simplon.towns.Capitale;
import co.simplon.towns.Ville;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   	Employe [] tab = new Employe [4]; 
		 	tab [0] = new Employe ("Dupont", "Henri", 51, "3 rue des",new Ville("toulouse","fr",500000),"Simplon",20000);
		 	tab [1] =new Employe("TOTO","Zerox",25,"50 CHEMIN",new Ville("Metz","fr",250000), "ECOLE", 55000);
		 	tab [2] = new Employe ("Ngoma", "Deo", 23, "25 chemin de Lestang",new Ville("Havane","Cuba",10000000),"UNIVERSTE",500);
		 	tab [3]= new Employe("SAMBA","poupi",35,"12 Av. Senghor",new Ville("Dakar","senegal",650000), "IKS", 15000);
		
		 	for (int i=0; i< tab.length; i++ ) {
		 //		System.out.println(tab[i]);
		 		tab[i].display();
		 }
	   		 	
		 	ArrayList <Employe> list = new ArrayList<Employe>();
			  list.add(new Employe("Dupont", "Henri", 51, "3 rue des",new Ville("toulouse","fr",500000),"Simplon",20000)); 
			  list.add(new Employe("TOTO","Zerox",25,"50 CHEMIN",new Ville("Metz","fr",250000), "ECOLE", 55000));
			  list.add(new Employe("Ngoma", "Deo", 23, "25 chemin de Lestang",new Ville("Havane","Cuba",10000000),"UNIVERSTE",500));
			  list.add(new Employe("SAMBA","poupi",35,"12 Av. Senghor",new Ville("Dakar","senegal",650000), "IKS", 15000));
			  
			  for(int i = 0; i < list.size(); i++)
			    {
			      System.out.println(list.get(i));
			    }  
		 	  		
	}

}
