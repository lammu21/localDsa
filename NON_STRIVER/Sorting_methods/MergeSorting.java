package Sorting_methods;

import java.util.Arrays;

/**
 * MergeSorting
 */
public class MergeSorting {

    
public static void main(String[] args) {
    int [] nums={6,5,4,3,2,1};
    mergesortingMethod(nums, 0, nums.length);

    System.out.println(Arrays.toString(nums));

}
    public static void mergesortingMethod(int[] nums,int low , int high){
        if (high-low==1) {
            return;
            
        }
        int mid=(low+high)/2;
        mergesortingMethod(nums, low, mid);
        mergesortingMethod(nums, mid, high);
        mergeMethod(nums, low, mid, high);


    }

    public static void mergeMethod(int[]nums,int low,int mid,int high)
    {
        int[] result=new int [high-low];
        int left=low;
        int right=mid;
        int index=0;

        while (left<mid&&right<high) {

            if(nums[left]<nums[right])
            {
                result[index]=nums[left];
                left++;
            }
            else{
                result[index]=nums[right];
                right++;
            }
            index++;
            
        }

        while (left<mid) {
           result[index]=nums[left];
           left++;
           index++;

        }
        while (right<high) {
            result[index]=nums[high];
            high++;
            index++;
 
         }

         for (int i = 0; i < result.length; i++) {
            nums[low+i]=result[i];
         }

    }
}