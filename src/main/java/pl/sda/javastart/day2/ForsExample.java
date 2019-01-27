package pl.sda.javastart.day2;

public class ForsExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            System.out.println("Adam");
        }
        printFewNaturalNumbers(8);
        printNotDividableByParam(12, 3);
        System.out.println(sumNaturalNumbersToLimit(1000));
        printNumbersInTower(8);
        System.out.println(sumWhileToLimit(1000));
        System.out.println(sumDoWhileToLimit(1000));
        printFibonacciNumbers(6);
    }

    public static void printFewNaturalNumbers(int maxNum) {
        for (int i = 0; i <= maxNum; i++) {
            System.out.println(i);
        }
    }

    public static void printNotDividableByParam(int maxNum, int param) {
        for (int i = 0; i < maxNum; i++) {
            if (i % param != 0) {
                System.out.println(i);
            }
        }
    }

    public static void printNotDividableByParamOtherWay(int maxNum, int param) {
        for (int i = 0; i < maxNum; i++) {
            if (i % param == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static int sumNaturalNumbersToLimit(int limit) {
        int sum = 0;
        for (int i = 0; ; i++) {
            if (sum + i >= limit) {
                break;
            }
            sum = sum + i;
        }
        return sum;
    }

    //Utwórz metodę przyjmującą parametr z liczbą wierszy i wypisującą liczby w ten sposób:
    //1
    //22
    //333

    public static void printNumbersInTower(int param) {
        for (int i = 1; i <= param; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static int sumWhileToLimit(int limit) {
        int sum = 0;
        int counter = 0;
        while (sum + counter <= limit) {
            sum = sum + (++counter);
        }
        return sum;
    }

    public static int sumDoWhileToLimit(int limit) {
        int sum = 0;
        int counter = 0;
        do {
            sum = sum + ++counter;
        } while (sum + counter <= limit);
        return sum;
    }

    public static void printFibonacciNumbers(int elements) {
        int first = 0;
        int second = 1;
        int counter = 1;
        System.out.println("0");
        System.out.println("1");
        while (counter <= elements-2) {
            int sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;
            counter++;

        }
    }


}
