package A1_2_array_linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Arrays
        int[] emptyArray;
        int[] filledArray = {1,2,3};

        printArray(filledArray);

        for(int i=0; i < filledArray.length; i++) {
            filledArray[i] = 26;
        }

        printArray(filledArray);

        // LinkedList
        LinkedList<String> fahrrad = new LinkedList<>();
        fahrrad.add("Rad");
        fahrrad.add("Rad");
        fahrrad.add("Lenker");
        fahrrad.add("Beleuchtung");
        fahrrad.add("Gangschaltung");

        System.out.println(fahrrad);

        fahrrad.set(1, "Mountainbikerad");
        fahrrad.addFirst("Fahrradcomputer");
        fahrrad.removeLast();

        System.out.println(fahrrad);
    }

    public static void printArray(int[] array) {
        System.out.print("Das Array hat folgende Werte: ");

        for(int i=0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }

        System.out.println();
    }
}
