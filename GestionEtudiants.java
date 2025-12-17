package POO;

public class GestionEtudiants {

    // ===== CRÉER DIRECTEMENT 50 ÉTUDIANTS =====
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

    // ===== TRIER PAR AGE =====
    public static void trierParAge(Etudiants[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i].getAge() > tab[j].getAge()) {
                    Etudiants temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }

    // ===== AFFICHER LES 5 PLUS ÂGÉS =====
    public static void afficherCinqPlusAges(Etudiants[] tab) {
        trierParAge(tab);
        System.out.println("\n--- 5 étudiants les plus âgés ---");
        for (int i = tab.length - 1; i >= tab.length - 5; i--) {
            tab[i].afficher();
        }
    }

    // ===== SUPPRIMER LES MOINS ÂGÉS (ex : < 20 ans) =====
    public static Etudiants[] supprimerMoinsAge(Etudiants[] tab, int ageMin) {

        int cpt = 0;
        for (Etudiants e : tab) {
            if (e.getAge() >= ageMin) {
                cpt++;
            }
        }

        Etudiants[] nouveau = new Etudiants[cpt];
        int index = 0;

        for (Etudiants e : tab) {
            if (e.getAge() >= ageMin) {
                nouveau[index++] = e;
            }
        }

        return nouveau;
    }
}
