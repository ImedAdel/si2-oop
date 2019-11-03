package td5.ex1;

public class Test {
    public static int lexicoComp(String a, String b) {
        return a.compareTo(b);
    }

    public static int altComp(String a, String b) {
        for (int i = 0; i < a.length() &&
                i < b.length(); i++) {
            if ((int) a.charAt(i) ==
                    (int) b.charAt(i)) {
                continue;
            } else {
                return (int) a.charAt(i) -
                        (int) b.charAt(i);
            }
        }

        if (a.length() < b.length()) {
            return (a.length() - b.length());
        } else if (a.length() > b.length()) {
            return (a.length() - b.length());
        }

        // If none of the above conditions is true, 
        // it implies both the strings are equal 
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String s1 = "Imed";
        String s2 = "Adel";
        System.out.println(lexicoComp(s1, s2));
        System.out.println(altComp(s1, s2));
    }
}