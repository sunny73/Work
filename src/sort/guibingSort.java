package sort;
import java.util.Arrays;
public class guibingSort {
    // 归并排序的实现  
    public static void main(String[] args) {
        int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4, -3};
        System.out.println(Arrays.toString(nums));
        sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] sort(int[] nums, int low, int high){
        int mid = (low+high)/2;
        if(low<high){
            sort(nums, low, mid);
            sort(nums, mid+1, high);
            merge(nums, low, mid, high);
        }
        return nums;
    }
    private static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=high){
            if(nums[i]<nums[j])
                temp[k++] = nums[i++];
            else
                temp[k++] = nums[j++];
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=high){
            temp[k++] = nums[j++];
        }
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[k2+low] = temp[k2];
        }
    }
}  
 