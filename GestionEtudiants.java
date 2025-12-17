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

public static void afficherCinqPlusAges(Etudiants[] tab) {
    trierParAge(tab); // tri croissant
    System.out.println("\n--- 5 étudiants les plus âgés ---");
    for (int i = tab.length - 1; i >= tab.length - 5; i--) {
        tab[i].afficher();
    }
}

    public static void afficherCinqPlusAges(Etudiants[] tab) {
    trierParAge(tab); // tri croissant
    System.out.println("\n--- 5 étudiants les plus âgés ---");
    for (int i = tab.length - 1; i >= tab.length - 5; i--) {
        tab[i].afficher();
    }
}

    public static void afficherCinqMoinsAges(Etudiants[] tab) {
    trierParAge(tab); // tri croissant
    System.out.println("\n--- 5 étudiants les moins âgés ---");
    for (int i = 0; i < 5; i++) {
        tab[i].afficher();
    }
}

public static double noteMaxTableau(Etudiants[] tab) {
    double max = tab[0].noteMax();
    for (Etudiants e : tab) {
        if (e.noteMax() > max) {
            max = e.noteMax();
        }
    }
    return max;
}

    public static double noteMinTableau(Etudiants[] tab) {
    double min = tab[0].noteMin();
    for (Etudiants e : tab) {
        if (e.noteMin() < min) {
            min = e.noteMin();
        }
    }
    return min;
}

    public static Etudiants[] supprimerMoinsAge(Etudiants[] tab, int ageMin) {
    int cpt = 0;
    for (Etudiants e : tab) {
        if (e.getAge() >= ageMin) cpt++;
    }

    Etudiants[] nouveau = new Etudiants[cpt];
    int index = 0;
    for (Etudiants e : tab) {
        if (e.getAge() >= ageMin) nouveau[index++] = e;
    }

    return nouveau;
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

