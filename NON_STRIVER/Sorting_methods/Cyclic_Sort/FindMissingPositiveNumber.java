package Sorting_methods.Cyclic_Sort;

import java.util.Arrays;

public class FindMissingPositiveNumber {
    public static void main(String[] args) {
      int [] nums = {3,4,-1,1};
      System.out.println(firstMissingPositive(nums));
    }


    public static int firstMissingPositive(int[] nums) {

        int i=0;
        while (i<nums.length) {
            int correct_index = nums[i]-1;
            if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[correct_index]){
                   swap(nums, i, correct_index);
            }
            else{
                i++;
            }
            
        }
        // System.out.println(Arrays.toString(nums));
        // return i;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1) {
                return j+1;
                
            }
        }
        return nums.length+1;

    }

    static void swap(int []nums, int i, int correct_index){
        int temp=nums[i];
        nums[i]=nums[correct_index];
        nums[correct_index]=temp;
    }
}

