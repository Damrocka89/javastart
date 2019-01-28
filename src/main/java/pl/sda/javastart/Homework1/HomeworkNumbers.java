package pl.sda.javastart.Homework1;

import java.util.Scanner;

public class HomeworkNumbers {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        numbers();
    }

    public static void numbers() {
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();
        if (number >= 0 && number <= 100) {
            System.out.println("mała liczba dodtnia");
        } else if (number > 100 && number <= 1000) {
            System.out.println("liczba dodatnia");
        } else if (number > 1000) {
            System.out.println("duża liczba dodatnia");
        } else if (number < 0 && number >= -100) {
            System.out.println("mała liczba ujemna");
        } else if (number < -100 && number >= -1000) {
            System.out.println("liczba ujemna");
        } else if (number < -1000) {
            System.out.println("duża liczba ujemna");
        } else {
            System.out.println("Nie podałeś liczby");
        }
    }
}
