import java.util.Scanner;
import java.util.ArrayList;
public class AgenceBancaire {
    ArrayList<Client> clients = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void ajouterClient() { // Methode permetant d'ajouter un client
        System.out.print("Votre numéro de compte : ");
        int numCompte = sc.nextInt();
        sc.nextLine(); // Pour vider notre scanner
        System.out.print("Entrez votre nom : ");
        String nom = sc.nextLine(); // Pour vider notre scanner
        System.out.print("Entrez votre prénom : ");
        String prenom = sc.nextLine();
        clients.add(new Client(numCompte, nom, prenom));
    }

    public void supprimerClient() { // Methode permetant de suprimer un client
        System.out.print("Numéro de compte du client à supprimer : "); // C'est plus raisonnable de suprimer par numero de compte
        int numCompte = sc.nextInt();
        sc.nextLine(); //  Pour vider notre scanner
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getNumCompte() == numCompte) {
                clients.remove(i);
                return; // cette return fonctionne comme un break
            }
        }
        System.out.println("Client introuvable"); // le cas ou le numero de compte est introuvable
    }

    public void modifierClient() {
        System.out.print("Numéro de compte du client à modifier : ");
        int numCompte = sc.nextInt();
        sc.nextLine(); // Pour vider le buffer
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getNumCompte() == numCompte) {
                System.out.print("modifiez le nom : ");
                clients.get(i).nom = sc.nextLine();
                System.out.print("modifiez le prénom : ");
                clients.get(i).prenom = sc.nextLine();
                return; // cette return fonctionne comme un break
            }
        }
        System.out.println("Client introuvable"); // le cas ou le numero de compte est introuvable
    }

    public void afficherClients() { // Pour verifier les modifications sur l'agence
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(clients.get(i).getNumCompte() + " - " + clients.get(i).nom + " " + clients.get(i).prenom);
        }
    }
}