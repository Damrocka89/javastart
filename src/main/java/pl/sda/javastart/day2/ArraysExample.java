package pl.sda.javastart.day2;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] tab = new int[5];
        tab[0] = 1;
        tab[2] = 1;
        tab[3] = 1;
        tab[4] = 1;


        // int[] anotherTable = {1,5,4,3,2,3}; skrocona wersja
        int[] anotherTable = new int[]{1, 5, 4, 3, 2, 3};

//        printElementsOfArray(anotherTable);
//        printElementsOfArrayForEach(anotherTable);
//        System.out.println(printPrettyArray(anotherTable));
//        System.out.println(anotherTable.toString());
//        System.out.println(Arrays.toString(anotherTable));
        System.out.println(Arrays.toString(findMaxAndMin(anotherTable)));

        //spróbuj wykonać stream:

//        Arrays.stream(anotherTable)
//                .filter(e-> e%2!=0)
//                .forEach(e->System.out.println(e));

    }

    public static void printElementsOfArray(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void printElementsOfArrayForEach(int[] tab) {
        for (int i : tab) {
            System.out.println(i);
        }
    }

    public static String printPrettyArray(int[] tab) {
        String result = "[";
        int counter = 0;
        for (int element : tab) {
            result = result + element;
            if (counter < tab.length - 1) {
                result = result + ",";
            }
            counter++;
        }
        result = result + "]";
        return result;
    }

    public static int[] findMaxAndMin(int[] tab) {
        int min = tab[0];
        int max = tab[0];
        for (int element : tab) { //skrót iter enter
            if (min > element) {
                min = element;
            }
            if (max < element) {
                max = element;
            }
        }
        int[] result = new int[]{min, max};
        return result;
    }

}
