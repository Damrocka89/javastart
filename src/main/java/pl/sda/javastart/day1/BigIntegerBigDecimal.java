package pl.sda.javastart.day1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("78577777777777777777777777777777777777777777777777");

        double x=0.02;
        double y=0.03;

        System.out.println(x-y);

        BigDecimal xx=new BigDecimal("0.02");
        BigDecimal yy=new BigDecimal("0.03");

        BigDecimal xyx=new BigDecimal(0.02); //niepoprawne
        BigDecimal yyx=new BigDecimal(0.03); //niepoprawne


        BigDecimal xxx= BigDecimal.valueOf(0.02); //poprawne
        BigDecimal yyy= BigDecimal.valueOf(0.03); //poprawne

        System.out.println(xx.subtract(yy));
        System.out.println(xyx.subtract(yyx));
        System.out.println(xxx.subtract(yyy));




    }


}
