package td2.ex1;

public class Etudiant {
    String nom;
    String prenom;
    int numCin;

    public Etudiant(int numCin, String nom, String prenom) {
        this.numCin = numCin;
        this.nom = nom;
        this.prenom = prenom;
    }

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

    public int getNumCin() {
        return numCin;
    }

    public void setNumCin(int numCin) {
        this.numCin = numCin;
    }
}