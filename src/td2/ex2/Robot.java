package td2.ex2;

public class Robot {
    public static final int nord = 1, est = 2, sud = 3, ouest = 4;
    int orient, abs, ord;

    public Robot() {
        this.orient = sud;
    }

    public Robot(int orient, int abs, int ord) {
        this.orient = orient;
        this.abs = abs;
        this.ord = ord;
    }

    public Robot(int abs, int ord) {
        this.abs = abs;
        this.ord = ord;
        this.orient = nord;
    }

    public void avancer(int pas) {
        switch (orient) {
            case nord:
                ord = ord + pas;
                break;
            case est:
                abs = abs + pas;
                break;
            case sud:
                ord = ord - pas;
                break;
            case ouest:
                abs = abs - pas;
                break;
        }
    }

    public void tourner() {
        switch (orient) {
            case nord:
                orient = sud;
                break;
            case est:
                orient = ouest;
                break;
            case sud:
                orient = nord;
                break;
            case ouest:
                orient = est;
                break;
        }
    }

    public void afficher() {
        String orientation = "";
        switch (orient) {
            case nord:
                orientation = "nord";
                break;
            case est:
                orientation = "est";
                break;
            case sud:
                orientation = "sud";
                break;
            case ouest:
                orientation = "ouest";
                break;
        }

        System.out.println("-> L'orientation est: " + orientation);
        System.out.println("-> L'abscisse est: " + this.abs);
        System.out.println("-> L'ordonne est: " + this.ord);
    }
}
