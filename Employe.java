package co.simplon.peoples;
import co.simplon.towns.Ville;

public class Employe extends Personne {
	public String entreprise;
	public double salaire;
	
	 public Employe() {
		 super();
		 this.entreprise="aucun";
		 this.salaire=0;
	 }
	 
	 public Employe(String nom, String prenom, int age, String adresse, Ville VilleNaissance,String entreprise, double salaire) {
		 super(nom, prenom, age, adresse, VilleNaissance);
		 this.entreprise = entreprise;
		 this.salaire = salaire;
	 }
	 public void setEntreprise(String entreprise) {
			this.entreprise = entreprise;
		}
	 public String getEntreprise() {
			return this.entreprise;
		}
	 public void setSalaire(double salaire) {
			this.salaire = salaire;
		}
	public double getSalaire() {
			return this.salaire;
		}
	public String toString(){
		return this.getNom()+ this.getPrenom()+this.getAge()+this.getEntreprise() +" " + this.getSalaire();
	}	
	public void display() {
		System.out.println(getNom() + ""+ getPrenom()+" "+getAge()+" "+getAdresse()+" "+ VilleNaissance +" "+getEntreprise()+" "+getSalaire());
	}
 
}
