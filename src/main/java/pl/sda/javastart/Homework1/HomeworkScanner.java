package pl.sda.javastart.Homework1;

import java.util.Scanner;

public class HomeworkScanner {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // conversation();
        //sumDifference();
        heyhello();
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

    public static void sumDifference() {
        System.out.println("Podaj pierwszą liczbe");
        int first = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int second = scanner.nextInt();
        String choice;
        boolean koniec = false;

        do {
            System.out.println("Dodać (+) czy odjąć (-)?");

            choice = scanner.next();
            scanner.nextLine();

            switch (choice) {
                case "+":
                    System.out.println(first + "+" + second + "=" + (first + second));
                    break;
                case "-":
                    System.out.println(first + "-" + second + "=" + (first - second));
                    break;
                case "koniec":
                    koniec = true;
                    break;
            }
        } while (!koniec);
    }

    public static void heyhello() {
        System.out.println("Pass the language code(PL, EN, DE, FR)");
        switch (scanner.nextLine()) {
            case "PL":
                System.out.println("Dzień dobry, witam serdecznie!");
                break;
            case "EN":
                System.out.println("Good morning! Welcome");
                break;
            case "DE":
                System.out.println("Guten Morgen. Herzlich wWlkommen");
                break;
            case "FR":
                System.out.println("Bonne matin. Bienvenue!");
                break;
            default:
                System.out.println("Wrong code, anyway: Welcome!");
                break;
        }
    }
}
