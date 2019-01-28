package pl.sda.javastart.Homework1;

import java.util.Scanner;

public class HomeworkScanner {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        conversation();
    }

    public static void conversation() {
        System.out.println("Cześć. Jak się czujesz?");
        String samopoczucie = scanner.nextLine();
        System.out.println("Cieszę się, że czujesz się " + samopoczucie);
        System.out.println("Jak masz na imię?");
        String imie = scanner.nextLine();
        System.out.println("Ile masz lat?");
        String lat = scanner.nextLine();
        System.out.println(imie + " masz " + lat + " lat");
        System.out.println("Ile masz wzrostu (dokładnie!)?");
        String wzrost = scanner.nextLine();
        System.out.println(imie + " masz " + wzrost + " cm");
        System.out.println("A jak czujesz się teraz?");
        samopoczucie = scanner.nextLine();
        System.out.println("Cieszę się, że czujesz się " + samopoczucie);

    }
}
