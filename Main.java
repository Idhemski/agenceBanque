/*
Code principale de l'agence pour le mini-projet de java
Equipe : Idriss el Waanabi, Oussama Hamdani, Mehdi Lahlou Mimi
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AgenceBancaire agence = new AgenceBancaire();
        // On ajoute 5 clients
        for (int i = 0; i < 5; i++) {
            agence.ajouterClient();
        }
        boolean continuer = true;

        while (continuer) {
            System.out.println("Veuillez choisir la tache que vous voulez : ");
            System.out.println("1- Ajouter un nouveau client");
            System.out.println("2- Supprimer un client");
            System.out.println("3- Modifier un client");
            System.out.println("4- Quitter le systeme");
            Scanner lecture = new Scanner(System.in);
            int choix = lecture.nextInt();

            switch (choix) {
                case 1 :
                    agence.ajouterClient();
                    break;

                case 2 :
                    agence.supprimerClient();
                    break;

                case 3 :
                    agence.modifierClient();
                    break;

                case 4 :
                    System.out.println("Merci pour votre usage et au revoir");
                    break;

                default:
                    System.out.println("Veuillez choisir un chiffre dans le menu!");
            }


        }



    }
}
