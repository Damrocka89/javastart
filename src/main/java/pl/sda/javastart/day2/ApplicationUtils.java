package pl.sda.javastart.day2;

public class ApplicationUtils {

    public static double convertToDouble(String text) {
        return Double.parseDouble(text);
    }

    public static Double convertToDoubleObject(String text) {
        //null porównujemy za pomocą ==, nie za pomocą equals
        if (text == null) {
            return null;
        }
        return Double.valueOf(text);
    }
}
