package pl.sda.javastart.day1;

import java.util.Scanner;

public class CalculatorExample {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę.");
        int firstValue=scanner.nextInt();
        System.out.println("Podaj drugą liczbę.");
        int secondValue=scanner.nextInt();
        System.out.println("a/b="+(firstValue/secondValue));
        System.out.println("a+b="+(firstValue+secondValue));
        System.out.println("a*b="+(firstValue*secondValue));
        System.out.println("a-b="+(firstValue-secondValue));
        System.out.println("|a-b|="+Math.abs(firstValue-secondValue));
        System.out.println("max(a,b)="+Math.max(firstValue, secondValue));
        System.out.println("a^b="+Math.pow(firstValue, secondValue));


    }

}
