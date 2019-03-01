package co.simplon.peoples;
import co.simplon.towns.Ville;
public class Personne {
	private String nom; // nom de la personne
	private String prenom; //prénnom dela personne
	private int age; // âge de la personne
	private String adresse; //adresse de la personne
	public static int nombre  = 0; // nombre d'instances de la classe
	public Ville VilleNaissance; // ville de naissance de la personne
	
	public Personne() {
		nom="";
		prenom="";
		age=0;
		adresse="";
		this.VilleNaissance=new Ville();
	}
	public Personne (String n, String p, int ag, String ad, Ville vn) {
		nom=n;
		prenom=p;
		age=ag;
		adresse=ad;
		VilleNaissance = vn; 
	//	nombre++;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return this.nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public void setAge(int age) {
		if(age<0) {
			this.age=0;			
		}else {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getAdresse() {
		return this.adresse;
	}
	
	public void display(){
		System.out.println(this.getNom()+" "+ this.getPrenom()+" " + this.getAge()+" "+ "ans"+ " " + "habitant"+ " " + this.getAdresse());
		//System.out.println(VilleNaissance.display());
	}
	
}





