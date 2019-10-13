package td2.ex2;

public class Test {

    public static void main(String[] args) {
        Robot rob = new Robot(4, 7);

        System.out.println("L'etat actuel du robot: ");
        rob.afficher();

        rob.tourner();
        rob.avancer(5);

        System.out.println("Le nouveau etat du robot: ");
        rob.afficher();
    }
}
