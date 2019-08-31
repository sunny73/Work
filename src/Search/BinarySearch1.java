package Search;

public class BinarySearch1 {
    //二叉树查找
    public  static  int  Search(int a[], int value)
    {
        int low, high, mid;
        low = 0;
        high = a.length-1;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(a[mid]==value)
                return mid;
            if(a[mid]>value)
                high = mid-1;
            if(a[mid]<value)
                low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        System.out.println(Search(a,4));
    }

}
