package POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== CRÉATION DU TABLEAU =====
        Etudiants[] etudiants = GestionEtudiants.saisirEtudiants(50);

        int choix;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Afficher tous les étudiants");
            System.out.println("2. Trier par âge");
            System.out.println("3. Afficher les 5 plus âgés");
            System.out.println("4. Supprimer les moins de 20 ans");
            System.out.println("5. Afficher les moyennes");

            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    GestionEtudiants.afficherTous(etudiants);
                    break;

                case 2:
                    GestionEtudiants.trierParAge(etudiants);
                    System.out.println("Tri effectué.");
                    break;

                case 3:
                    GestionEtudiants.afficherCinqPlusAges(etudiants);
                    break;

                case 4:
                    etudiants = GestionEtudiants.supprimerMoinsAge(etudiants, 20);
                    System.out.println("Suppression effectuée.");
                    break;


                    case 5:
    for (Etudiants e : etudiants) {
        System.out.println(
            e.getNom() + " " + e.getPrenom() +
            " | Moyenne : " + e.calculmoy()
        );
    }
    break;

                case 0:
                    System.out.println("Fin du programme.");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 0);
    }
}

