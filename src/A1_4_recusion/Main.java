package A1_4_recusion;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        countdown(new Random().nextInt(20));
        System.out.println(factorial(3));
        System.out.println(sum(3));
    }

    private static void countdown(int i) {
        System.out.println(i);
        if (i > 0) {
            i--;
            countdown(i);
        }
    }

    private static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static int sum(int num) {
        if (num == 1) {
            return 1;
        }

        return num + sum(num - 1);
    }
}
