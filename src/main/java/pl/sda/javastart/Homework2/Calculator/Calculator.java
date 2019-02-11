package pl.sda.javastart.Homework2.Calculator;

import java.util.Arrays;

public class Calculator {


    public void sum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void subtract(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public void divide(int a, int b) {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    public void modulo(int a, int b) {
        System.out.println(a + " % " + b + " = " + (a % b));
    }

    public void maxFromTable(int[] table) {
        int max = table[0];

        for (int i : table) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Maximum value from " + Arrays.toString(table) + " is " + max);
    }

    public void sumAllFromTable(int[] table) {
        int sum = 0;

        for (int i : table) {
            sum = sum + i;
        }
        System.out.println("Sum of all values from table: " + Arrays.toString(table) + " is " + sum);
    }

    public void averageFromTable(double[] table) {
        double sum = 0;

        for (double i : table) {
            sum = sum + i;
        }

        double average = sum / table.length;
        System.out.println("Average of all values from table: " + Arrays.toString(table) + " is " + average);
    }

    public void power(double a, double b) {
        System.out.println(a + " ^ " + b + " = " + (Math.pow(a, b)));
    }

}
