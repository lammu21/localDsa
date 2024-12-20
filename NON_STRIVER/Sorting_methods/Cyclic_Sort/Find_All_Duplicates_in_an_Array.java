package Sorting_methods.Cyclic_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
       int [] nums = {4,3,2,7,8,2,3,1};
       List<Integer> ans =findDuplicates(nums);

       for (Integer integer : ans) {
        System.out.println(integer);
       }
    }


    public static List<Integer> findDuplicates(int[] nums) {
     

        int i =0;

        while(i<nums.length){

            int correct_index=nums[i]-1;
            if(nums[i]!=nums[correct_index]){
                swap(nums, i, correct_index);
            }
            else {
                i++;
            }
            
        }

        // System.out.println(Arrays.toString(nums));

        List<Integer> list1= new ArrayList<Integer>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1) {
                list1.add(nums[j]);
                
            }
        }
            
       
        return list1;
             
    }


    static void swap(int []nums, int i, int correct_index){
        int temp=nums[i];
        nums[i]=nums[correct_index];
        nums[correct_index]=temp;
    }
}
