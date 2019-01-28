package pl.sda.javastart.Homework1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HomeworkMethodsUtils {

    public static void main(String[] args) {
        String wyraz = "cos";
        System.out.println(isEmpty(wyraz));
        System.out.println(stringToBigDecimal("1.15851"));
        System.out.println(celsiusToFahrenheit(27));
        System.out.println(yearOfBirthToAge(1989));
        System.out.println(fieldOfCircle(8));
        System.out.println(volumeOfSphere(8));
    }

    public static boolean isEmpty(String wyraz) {
        return wyraz == null;
    }

    public static BigDecimal stringToBigDecimal(String number) {

        return BigDecimal.valueOf(Double.parseDouble(number)).setScale(3, BigDecimal.ROUND_HALF_UP);
    }

    public static int celsiusToFahrenheit(int celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static int fahrenheitTocelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kmPerHourToMilesPerHour(double kmPerHour) {
        return (kmPerHour * 0.62137);
    }

    public static double milesPerHourToKmPerHour(double milesPerHour) {
        return (milesPerHour / 0.62137);
    }

    public static int minutesToQuarters(int minutes) {
        return (minutes / 15);
    }

    public static int yearOfBirthToAge(int birthYear) {
        return (LocalDate.now().getYear() - birthYear);
    }

    public static int fieldOfCircle(int r) {
        return ((int) Math.PI * (int) Math.pow(r, 2));
    }

    public static double volumeOfSphere(int r) {
        return 4 / 3 * Math.PI * Math.pow(r, 3);
    }
}
