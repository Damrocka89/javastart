package pl.sda.javastart.Homework2.Calculator;

public class MainCalculator {

    public static void main(String[] args) {

        Calculator calculator=new Calculator();

        calculator.sum(15,20);
        calculator.subtract(15,20);
        calculator.multiply(5,10);
        calculator.divide(89,9);
        calculator.modulo(99,15);
        int[] table={12,15,89,99,63,14,4};
        calculator.maxFromTable(table);
        calculator.sumAllFromTable(table);
        double[] tableDouble={2.5,1.9,54.21,0.2};
        calculator.averageFromTable(tableDouble);
        calculator.power(4,0.5);


    }
}
