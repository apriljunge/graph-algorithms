package A1_3_bubblesort;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> liste = new LinkedList<>();

        for (int i=0; i < 20; i++) {
            liste.add(new Random().nextInt(20));
        }

        System.out.println(liste);

        bubblesort(liste);

        System.out.println(liste);
    }

    public static void bubblesort(LinkedList<Integer> liste) {
        for (int i=0; i < liste.size() - 1; i++) {
            for (int j=0; j < liste.size() - 1 - i; j++) {
                if (liste.get(j) > liste.get(j+1)) {
                    // swap values
                    int val = liste.get(j);
                    liste.set(j, liste.get(j+1));
                    liste.set(j+1, val);
                }
            }
        }

    }
}
