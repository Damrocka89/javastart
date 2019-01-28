package pl.sda.javastart.Homework1;

import java.util.Scanner;

public class HomeworkExamResults {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ocena();
    }

    public static void ocena() {
        System.out.println("Ile dostałaś/eś punktów?(0-100)");
        int punkty = scanner.nextInt();
        if (punkty < 50) {
            System.out.println("Twoja ocena to 1");
        } else if (punkty > 50 && punkty <= 60) {
            System.out.println("Twoja ocena to 2");
        } else if (punkty > 60 && punkty <= 70) {
            System.out.println("Twoja ocena to 3");
        } else if (punkty > 70 && punkty <= 80) {
            System.out.println("Twoja ocena to 4");
        } else if (punkty > 80 && punkty <= 90) {
            System.out.println("Twoja ocena to 5");
        } else if (punkty > 90 && punkty <= 100) {
            System.out.println("Twoja ocena to 6");
        } else System.out.println("Podałeś/aś niewłaściwą liczbę");

    }
}
