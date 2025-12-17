package POO;

import java.util.Arrays;
import java.util.Comparator;

public class GestionEtudiants {

    // ===== CRÉER N ÉTUDIANTS =====
    public static Etudiants[] saisirEtudiants(int n) {
        Etudiants[] tab = new Etudiants[n];
        for (int i = 0; i < n; i++) {
            double[] notes = {10 + i % 5, 12 + i % 4, 14 + i % 3};
            tab[i] = new Etudiants(
                "Nom" + (i + 1),
                "Prenom" + (i + 1),
                18 + (i % 10),
                notes
            );
        }
        return tab;
    }

    // ===== AFFICHER TOUS =====
    public static void afficherTous(Etudiants[] tab) {
        for (Etudiants e : tab) {
            e.afficher();
        }
    }

    // ===== TRI PAR AGE =====
    public static void trierParAge(Etudiants[] tab) {
        Arrays.sort(tab, Comparator.comparingInt(Etudiants::getAge));
    }

    // ===== AFFICHER 5 PLUS AGES =====
    public static void afficherCinqPlusAges(Etudiants[] tab) {
        trierParAge(tab);
        System.out.println("\n--- 5 étudiants les plus âgés ---");
        for (int i = tab.length - 1; i >= Math.max(tab.length - 5, 0); i--) {
            tab[i].afficher();
        }
    }

    // ===== AFFICHER 5 MOINS AGES =====
    public static void afficherCinqMoinsAges(Etudiants[] tab) {
        trierParAge(tab);
        System.out.println("\n--- 5 étudiants les moins âgés ---");
        for (int i = 0; i < Math.min(5, tab.length); i++) {
            tab[i].afficher();
        }
    }

    // ===== NOTE MAX DANS LE TABLEAU =====
    public static double noteMaxTableau(Etudiants[] tab) {
        double max = tab[0].noteMax();
        for (Etudiants e : tab) {
            if (e.noteMax() > max) max = e.noteMax();
        }
        return max;
    }

    // ===== NOTE MIN DANS LE TABLEAU =====
    public static double noteMinTableau(Etudiants[] tab) {
        double min = tab[0].noteMin();
        for (Etudiants e : tab) {
            if (e.noteMin() < min) min = e.noteMin();
        }
        return min;
    }

    // ===== SUPPRIMER LES ETUDIANTS DE MOINS DE ageMin =====
    public static Etudiants[] supprimerMoinsAge(Etudiants[] tab, int ageMin) {
        int cpt = 0;
        for (Etudiants e : tab) if (e.getAge() >= ageMin) cpt++;

        Etudiants[] nouveau = new Etudiants[cpt];
        int index = 0;
        for (Etudiants e : tab) {
            if (e.getAge() >= ageMin) nouveau[index++] = e;
        }
        return nouveau;
    }

    // ===== MOYENNE DES AGES =====
    public static double moyenneAge(Etudiants[] tab) {
        double somme = 0;
        for (Etudiants e : tab) somme += e.getAge();
        return somme / tab.length;
    }
}
