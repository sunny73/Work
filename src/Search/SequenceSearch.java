package Search;

public class SequenceSearch {
    //顺序查找
    public  static  int  SequenceSearch(int a[], int value)
    {
        int i;
        for(i=0; i<a.length; i++)
            if(a[i]==value)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        System.out.println(SequenceSearch(a,4));
    }

}
