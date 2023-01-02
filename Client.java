public class Client {
    private int numCompte; // Un numero de compte doit etre privé (Encapsulation de donnée)
    public  String nom;
    public String prenom;

    public Client(int numCompte, String nom, String prenom) {
        this.numCompte = numCompte;
        this.nom = nom;
        this.prenom = prenom;
    }
    public  int getNumCompte() { //Getter
        return numCompte;
    }
    public void setNumCompte(int nouvnumcompte) { //Setter
        this.numCompte = nouvnumcompte;
    }
}