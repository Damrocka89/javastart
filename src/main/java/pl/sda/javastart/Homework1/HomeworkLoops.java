package pl.sda.javastart.Homework1;

import java.util.Scanner;

public class HomeworkLoops {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        printCubesOfNumbers(4);
//        countdown(15);
//        printMultiplications(6);
//        interval(5, 9);
//        powerWithLimit(2, 20);
//        oddEvenFor();
//        System.out.println("****************************");
//        oddEvenWhile();
//        System.out.println("****************************");
//        oddEvenDoWhile();
//        arythmeticsScanner();

        // tree(3);
        //xmasTree(10);
        //xmasTree(11);
        multiplicationTable(8);

    }

    public static void printCubesOfNumbers(int limit) {
        for (int i = 0; i <= limit; i++) {
            System.out.println(i + "^3 = " + Math.pow(i, 3));
        }
    }

    public static void countdown(int startingPoint) {
        for (int i = startingPoint; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void printMultiplications(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(number + "*" + i + " = " + (number * i));
        }
    }

    public static void interval(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public static void powerWithLimit(int number, int limit) {
        int power = 0;
        while (Math.pow(number, power) <= limit) {
            System.out.println(Math.pow(number, power));
            power++;
        }
    }

    public static void oddEvenFor() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " jest liczbą parzystą");
            } else {
                System.out.println(i + " jest liczbą nieparzystą");
            }
        }
    }

    public static void oddEvenWhile() {
        int counter = 1;
        while (counter <= 20) {
            if (counter % 2 == 0) {
                System.out.println(counter + " jest liczbą parzystą");
            } else {
                System.out.println(counter + " jest liczbą nieparzystą");
            }
            counter++;
        }
    }

    public static void oddEvenDoWhile() {
        int counter = 1;
        do {
            if (counter % 2 == 0) {
                System.out.println(counter + " jest liczbą parzystą");
            } else {
                System.out.println(counter + " jest liczbą nieparzystą");
            }
            counter++;
        } while (counter <= 20);
    }

    public static void arythmeticsScanner() {
        int[] elements = new int[5];
        int sum = 0;
        int average = 0;
        System.out.println("Podaj 5 różnych liczb całkowitych");
        for (int i = 0; i < 5; i++) {
            elements[i] = scanner.nextInt();
            sum += elements[i];
        }
        int min = elements[0];
        int max = elements[0];
        for (int element : elements) {
            if (min > element) {
                min = element;
            }
            if (max < element) {
                max = element;
            }
        }
        average = sum / elements.length;
        System.out.println("Suma wszystkich liczb wynosi: " + sum + ", średnia zaś: " + average + ", min: " + min + ", max: " + max);
    }

    public static void tree(int verse) {
        for (int i = 1; i <= verse; i++) {
            for (int k = verse - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void xmasTree(int verse) {
        for (int i = 1; i <= verse; i++) {
            for (int j = verse + 1 - i; j > 0; j--) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int m = verse - i + 2; m <= verse && i > 1; m++) {
                System.out.print(verse - m + 1);
            }
            for (int n = verse + 1 - i; n > 0; n--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void multiplicationTable(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("\t" + i);
        }
        System.out.println("");
        for (int i = 1; i <= number; i++) {
            System.out.print("-----");
        }
        System.out.println("");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + "|");
            for (int j = 1; j <= number; j++) {
                System.out.print("\t" + i * j);
            }
            System.out.println("");
        }
    }
}

