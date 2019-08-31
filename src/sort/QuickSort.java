package sort;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int a[], int low, int hight) {
        int i, j, index,t;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        index = a[i]; // 用子表的第一个记录做基准
        while(i!=j)
        {
            while(a[j]>=index && i<j)
                j--;
            while(a[i]<=index && i<j)
                i++;
            if(i<j)
            {
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        a[low]=a[i];
        a[i]=index;

       sort(a,low,i-1);//继续处理左边的，这里是一个递归的过程
       sort(a,i+1,hight);//继续处理右边的 ，这里是一个递归的过程
    }

    public static void main(String[] args) {

        int a[] = { 49, 38, 65, 97, 76, 13, 27, 49 };
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
