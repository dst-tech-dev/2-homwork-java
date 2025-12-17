package POO;

public class Etudiants {
                        //atribus 
	private String nom;
	private String prenom;
	private int age ;
	private double[] notes ;
	
	//constructeur par defaut 
	public Etudiants(String nom, String prenom, int age, double[] notes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.notes = notes;
	}
	
	//getter setter 
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double[] getNotes() {
		return notes;
	}
	public void setNotes(double[] notes) {
		this.notes = notes;
	}	
	
	//methode calculer les moyens 
		 public double calculmoy() {
			 double som = 0;
			 for (double note : notes ){// on parcourut la chaque note 
			 som = som + note;
		 }	
		 return som / notes.length; // on divise par le nbr de note 
		 
	}
		 
		//methodwe trouver la note maximal 
		 public double noteMax() {
			    double max = notes[0];
			    for (double n : notes) {
			        if (n > max) {
			            max = n;
			        }
			    }
			    return max;
			}

		

 public double noteMin() {
	 double min = notes [0];
	 for (double n : notes ) { // on parcourut la note 
		 if (n < min )   // si la note est plus petite
			 min = n  ;   // on la met comme min
			 
	 }

 return min;  // retourne la note minimale
		 
		 
 }
 // methode afficher tous les informations de l'etudians 
  
 
			 public void afficher() {
			        System.out.println(
			            "Nom : " + nom +
			            " | Prénom : " + prenom +
			            " | Age : " + age +
			            
			            " | Moyenne : " + calculmoy() +
			            " | Note max : " + noteMax() +
			            " | Note min : " + noteMin()
			        );
			 
			 
			 }
	
	
}
