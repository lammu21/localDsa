package Sorting_methods.Cyclic_Sort;

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int [] nums={1,2,2,4};

       System.out.println(Arrays.toString(findErrorNums(nums)));
    }




    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int correct_index=nums[i]-1;
            if (nums[i]!=nums[correct_index]) {
                
                swap(nums, i, correct_index);
            }
            else {
                i++;
            }
            
        }
        //   int [] ans = new int[2];
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
              return new int []{nums[j],j+1};
            }
        }

        return new int[]{-1,-1};
    }

    static void swap(int []nums, int i, int correct_index){
        int temp=nums[i];
        nums[i]=nums[correct_index];
        nums[correct_index]=temp;
    }
}
