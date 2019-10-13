package td2.ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Max de l'ecole:");
        int maxSize = s.nextInt();
        s.nextLine();

        System.out.println("Nom de l'ecole:");
        String nomEcole = s.nextLine();

        System.out.println("Adresse de l'ecole:");
        String adresseEcole = s.nextLine();

        Ecole nouveauEcole = new Ecole(maxSize, nomEcole, adresseEcole);

        // Break loop if cin == 0

        for (int i = 0; i < nouveauEcole.listeEtudiants.length; ++i) {
            System.out.println("Nom:");
            String nomEtudiant = s.nextLine();

            System.out.println("Prenom:");
            String prenomEtudiant = s.nextLine();

            System.out.println("CIN:");
            int numCinEtudiant = s.nextInt();
            s.nextLine();
            if (numCinEtudiant == 0) break;

            Etudiant nouveauEtudiant = new Etudiant(numCinEtudiant, nomEtudiant, prenomEtudiant);
            nouveauEcole.ajouter(nouveauEtudiant);
        }

        nouveauEcole.affiche();
    }
}