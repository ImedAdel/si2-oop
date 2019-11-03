package td5.ex2;

import java.util.HashMap;

public class Test {

    public static HashMap<Character, Integer> counter(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = freq.get(c);
            if (val != null) {
                freq.put(c, val + 1);
            } else {
                freq.put(c, 1);
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        String s = "Imed Adel";
        HashMap<Character, Integer> freq = counter(s);

        for (char i : freq.keySet()) {
            System.out.println("Char: " + i + " Frequency: " + freq.get(i));
        }

    }
}