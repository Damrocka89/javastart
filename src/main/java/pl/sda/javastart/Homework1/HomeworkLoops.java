package pl.sda.javastart.Homework1;

public class HomeworkLoops {

    public static void main(String[] args) {

        printCubesOfNumbers(4);
        countdown(15);
        printMultiplications(6);
        interval(5, 9);
        powerWithLimit(2, 20);
        oddEvenFor();
        System.out.println("****************************");
        oddEvenWhile();
        System.out.println("****************************");
        oddEvenDoWhile();
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

    public static void oddEvenWhile(){
        int counter=1;
        while (counter<=20){
            if (counter % 2 == 0) {
                System.out.println(counter + " jest liczbą parzystą");
            } else {
                System.out.println(counter + " jest liczbą nieparzystą");
            }
            counter++;
        }
    }

    public static void oddEvenDoWhile(){
        int counter=1;
        do {
            if (counter % 2 == 0) {
                System.out.println(counter + " jest liczbą parzystą");
            } else {
                System.out.println(counter + " jest liczbą nieparzystą");
            }
            counter++;
        }while (counter<=20);
    }
}
