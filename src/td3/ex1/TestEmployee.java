package td3.ex1;

import java.util.Scanner;

/**
 * @author etudiant2
 */
public class TestEmployee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Nom entreprise:");
        String nomEnt = s.nextLine();

        System.out.println("Adresse entreprise: ");
        String adresEnt = s.nextLine();

        Entreprise nouvEnt = new Entreprise(nomEnt, adresEnt);

        // break if id == 0

        while (true) {
            System.out.println("Entrer id, prenom, nom, salaire");
            int idEmp = s.nextInt();
            s.nextLine();
            if (idEmp == 0) break;

            String firstNameEmp = s.nextLine();
            String lastNameEmp = s.nextLine();
            int salaryEmp = s.nextInt();
            s.nextLine();


            nouvEnt.ajouter(new Employee(idEmp, salaryEmp, firstNameEmp, lastNameEmp));
        }

        nouvEnt.afficher();
    }
}
