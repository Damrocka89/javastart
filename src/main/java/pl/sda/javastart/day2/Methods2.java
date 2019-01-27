package pl.sda.javastart.day2;

public class Methods2 {

    public static void main(String[] args) {
        String text="3.3";
        System.out.println(ApplicationUtils.convertToDouble(text));
        text=text+"  ";
        System.out.println(ApplicationUtils.convertToDouble(text));
        text=null;
        System.out.println(ApplicationUtils.convertToDoubleObject(text));

    }
}
