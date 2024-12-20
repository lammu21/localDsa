package Sorting;

import java.util.Arrays;

public class leftrotate_Optimal_method {

    public static void main(String[] args) {
        int []nums={-1,-100,3,99};
        int k=2; 
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    

    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        // int len = nums.length;
        k %= n;
        
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
       
       
    }

    public static void reverseArray(int [] nums , int start, int end ){
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}


