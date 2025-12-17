package POO;

public class Etudiants {
    // Attributs
    private String nom;
    private String prenom;
    private int age;
    private double[] notes;

    // Constructeur
    public Etudiants(String nom, String prenom, int age, double[] notes) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.notes = notes;
    }

    // Getters et Setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double[] getNotes() { return notes; }
    public void setNotes(double[] notes) { this.notes = notes; }

    // Méthode pour calculer la moyenne
    public double calculMoy() {
        double somme = 0;
        for (double note : notes) {
            somme += note;
        }
        return somme / notes.length;
    }

    // Méthode pour obtenir la note maximale
    public double noteMax() {
        double max = notes[0];
        for (double n : notes) {
            if (n > max) max = n;
        }
        return max;
    }

    // Méthode pour obtenir la note minimale
    public double noteMin() {
        double min = notes[0];
        for (double n : notes) {
            if (n < min) min = n;
        }
        return min;
    }

    // Méthode pour afficher toutes les informations de l'étudiant
    public void afficher() {
        System.out.println(
            "Nom : " + nom +
            " | Prénom : " + prenom +
            " | Age : " + age +
            " | Moyenne : " + calculMoy() +
            " | Note max : " + noteMax() +
            " | Note min : " + noteMin()
        );
    }
}

