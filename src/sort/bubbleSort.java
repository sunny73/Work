package sort;

import java.util.Arrays;

public class bubbleSort {

    public static void sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array) + " sort.bubbleSort");
    }


    public static void main(String[] args) {


        int a[] = { 49, 38, 65, 97, 76, 13, 27, 49 };
        sort(a);
//        System.out.println(Arrays.toString(a));

    }
}
