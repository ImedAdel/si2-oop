package td3.ex1;

import java.util.ArrayList;

/**
 * @author etudiant2
 */
public class Entreprise {
    public String nom, adresse;
    public ArrayList<Employee> employeeList;

    public Entreprise(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.employeeList = new ArrayList<>();
    }


    public void ajouter(Employee e) {
        employeeList.add(e);

    }

    public boolean chercher(int id) {
        for (Employee el : employeeList) {
            if (el.getId() == id) return true;
        }
        return false;
    }

    public void afficher() {
        for (Employee el : employeeList) {
            System.out.println(el.toString());
        }
    }
}
