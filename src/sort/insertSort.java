package sort;

import java.util.Arrays;

public class insertSort {

    public static void sort(int[] array) {
            for (int i = 1; i < array.length; i++) {
                int temp = array[i];
                int j = i - 1;
                for (; j >= 0 && array[j] > temp; j--) {
                    array[j + 1] = array[j];
                }
                array[j + 1] = temp;
            }
            System.out.println(Arrays.toString(array) + " sort.insertSort");
        }


    public static void main(String[] args) {


        int a[] = { 49, 38, 65, 97, 76, 13, 27, 49 };
        sort(a);

    }
}
