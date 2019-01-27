package pl.sda.javastart.day1;

public class Methods {
    public static final double INCH_TO_METER_MULTIPLIER = 0.0254;

    public static void main(String[] args) {
        int a=2;
        int b=3;

        printSum(a,b);
        int sum=returnSum(a, b);
        System.out.println(sum);
    }

    public static void printSum(int a, int b) {
        System.out.println("Efekt działania metody printsum:"+(a+b));
    }

    public static int returnSum(int a, int b){
        return a+b;

    }
    //Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn,

    public static void sumSubstraction(int a, int b){
        System.out.println("suma: "+ (a+b));
        System.out.println("różnica: "+ (a-b));
        System.out.println("iloczyn: "+ (a*b));
    }

    public static double inchToMeter (int inch){
        return (inch*INCH_TO_METER_MULTIPLIER);

    }

}
