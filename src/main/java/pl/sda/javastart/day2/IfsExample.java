package pl.sda.javastart.day2;

public class IfsExample {
    public static void main(String[] args) {
        System.out.println(isEven(14));
        System.out.println(dividableByThreeAndFive(35));
        System.out.println(introduction("Ewelina", 30, false));
        System.out.println(answerCell(true, false, false));
        System.out.println(switchCalculator(15, 12, '/'));
    }

    private static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    private static boolean dividableByThreeAndFive(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return true;
        }
        return false;
    }

    private static String introduction(String name, int age, boolean isMan) {
        String gender;
        if (isMan) {
            gender = "mężczyzną";
        } else
            gender = "kobietą";

        return "Cześć jestem " + name + ", mam " + age + " lat i jestem " + gender;

    }
/*Utwórz metodę, do której przekazujesz trzy parametry a ona zwróci informację
(wartość logiczną - `boolean`) czy suma pierwszych dwóch daje trzeci.*/

    private static boolean theeParamSum(int firstNum, int secondNum, int thirdNum) {
        //todo można zrobić z jednym ifem i ||

        if (firstNum + secondNum == thirdNum) {
            return true;
        } else if (secondNum + thirdNum == firstNum) {
            return true;
        } else if (thirdNum + firstNum == secondNum) {
            return true;
        }
        return false;
    }

    /*answerCell(boolean isMama,boolean isMorning, boolean isAsleep) - dzwoni telefon,
    mamy zwrócić true jeśli chcemy go odebrać.
Nie odbieramy kiedy śpimy.
Nie odbieramy kiedy jest rano i nie jest to telefon od mamy */

    public static boolean answerCell(boolean isMama, boolean isMorning, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else if (isMorning && !isMama) {
            return false;
        }
        return true;
    }

    public static Double switchCalculator(int firstNum, int secondNum, char sign) {
        switch (sign) {
            case '+':
                return Double.valueOf(firstNum + secondNum); //valueof najpierw liczy nawias potem zamienia na Double, co daje niedokładny wynik
            case '-':
                return Double.valueOf(firstNum - secondNum);
            case '*':
                return Double.valueOf(firstNum * secondNum);
            case '/':
                if (secondNum == 0) {
                    System.out.println("Nie dziel przez 0");
                    return null;
                }
                return (double) firstNum / secondNum; //można to zrobić przez rozszerzanie typu np (double)a+b a potem autoboxing działa
            default:
                System.out.println("Nie wybrałeś znaku");
                return null;
        }
    }

    //ternary operator / operator warunkowy
    //liczba2 = liczba1 < 0 ? -1 : 1;

    public static boolean isEvenTernary(int firstNum) {
        return firstNum % 2 == 0 ? true : false; //ternary operator nie jest potrzebny return firstNum%2==0;

    }

    private static String introductionWithTernary(String name, int age, boolean isMan) {
        String gender = isMan ? "mężczyzną" : "kobietą";
        return "Cześć jestem " + name + ", mam " + age + " lat i jestem " + gender;
    }
}
