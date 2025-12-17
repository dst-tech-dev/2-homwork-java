package POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== CREATION DU TABLEAU =====
        Etudiants[] etudiants = GestionEtudiants.saisirEtudiants(50);

        int choix;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Afficher tous les étudiants");
            System.out.println("2. Trier par âge");
            System.out.println("3. Afficher 5 plus âgés");
            System.out.println("4. Afficher 5 moins âgés");
            System.out.println("5. Plus grande note");
            System.out.println("6. Plus petite note");
            System.out.println("7. Supprimer les étudiants de moins de 20 ans");
            System.out.println("8. Moyenne des âges");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            choix = sc.nextInt();

            switch (choix) {
                case 1 -> GestionEtudiants.afficherTous(etudiants);
                case 2 -> {
                    GestionEtudiants.trierParAge(etudiants);
                    System.out.println("Tri effectué.");
                }
                case 3 -> GestionEtudiants.afficherCinqPlusAges(etudiants);
                case 4 -> GestionEtudiants.afficherCinqMoinsAges(etudiants);
                case 5 -> System.out.println("Plus grande note : " + GestionEtudiants.noteMaxTableau(etudiants));
                case 6 -> System.out.println("Plus petite note : " + GestionEtudiants.noteMinTableau(etudiants));
                case 7 -> {
                    etudiants = GestionEtudiants.supprimerMoinsAge(etudiants, 20);
                    System.out.println("Suppression effectuée.");
                }
                case 8 -> System.out.println("Moyenne des âges : " + GestionEtudiants.moyenneAge(etudiants));
                case 0 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix invalide !");
            }

        } while (choix != 0);

        sc.close();
    }
}
