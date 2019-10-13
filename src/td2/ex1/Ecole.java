package td2.ex1;

public class Ecole {
    public String nom;
    public String adresse;
    public Etudiant[] listeEtudiants;

    public Ecole(int maxSize, String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        listeEtudiants = new Etudiant[maxSize];
    }

    public void getNbrEtudiants() {
        System.out.println(listeEtudiants.length);
    }

    public void affiche() {
        for (Etudiant e : listeEtudiants) {
            if (e != null) {
                System.out.println(e.nom);
                System.out.println(e.prenom);
                System.out.println(e.numCin);
            } else break;
        }
    }

    public void ajouter(Etudiant e) {
        for (int i = 0; i < listeEtudiants.length; i++) {
            if (listeEtudiants[i] == null) {
                listeEtudiants[i] = e;
                break;
            }
        }
    }

}