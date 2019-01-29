package pl.sda.javastart.Homework1;

public class HomeworkArrays {

    public static void main(String[] args) {

        int[] tab = new int[]{1,5,10,3,2};
        //System.out.println(returnSum(tab, 12, 15));
        //System.out.println(Arrays.toString(reverseArray(tab)));
        System.out.println(sumWithoutMax(tab));
    }

    public static int returnSum(int[] tablica, int min, int max) {
        int sum = 0;
        for (int i : tablica) {
            if (i >= min && i <= max) {
                sum += i;
            }
        }
        return sum;
    }

    public static int[] reverseArray(int[] tablica) {
        int fromLast = tablica.length - 1;
        int temporary = 0;
        for (int i = 0; i < tablica.length / 2; i++) {
            temporary = tablica[i];
            tablica[i] = tablica[fromLast];
            tablica[fromLast] = temporary;
            fromLast--;
        }
        return tablica;
    }

    public static int sumWithoutMax(int[] tab) {
        int max = tab[0];
        for (int i : tab) {
            if (max<i){
                max=i;
            }
        }
        int sum=0;
        for (int i : tab) {
            if (i!=max){
                sum=sum+i;
            }
        }
        return sum;
    }
}
