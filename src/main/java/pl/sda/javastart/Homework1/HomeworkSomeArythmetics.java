package pl.sda.javastart.Homework1;

public class HomeworkSomeArythmetics {

    public static void main(String[] args) {
        System.out.println(obliczenia(6, 2, 3, 1));

    }

    public static int obliczenia(int a, int b, int c, int x) {
        int wynik = (int) Math.pow(a, x) + (int) Math.pow(b, (x + 1)) + (int) Math.pow(c, (x + 2));
        return wynik;
    }
}
