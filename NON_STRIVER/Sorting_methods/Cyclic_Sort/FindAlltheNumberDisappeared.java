package Sorting_methods.Cyclic_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * FindAlltheNumberDisappeared
 */
public class FindAlltheNumberDisappeared {

    public static void main(String[] args) {
        int [] nums={1,1};
         
    List <Integer> list1= findDisappearedNumbers(nums);
        for (int i : list1) {
            System.out.println(i);
        }
       
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
      int i=0;
      while(i<nums.length){
          int correct=nums[i]-1;
          if(nums[i]!=nums[correct]){
              swap(nums,i,correct);
          }
          else {
              i++;
          }
      }
      System.out.println(Arrays.toString(nums));

      List<Integer> ans= new ArrayList<>();
      for(int j=0;j<nums.length;j++){
          if(nums[j]-1!=j){
            ans.add(j+1);
          }
      }
       return ans; 
    }

    static void swap(int []nums, int i, int correct_index){
        int temp=nums[i];
        nums[i]=nums[correct_index];
        nums[correct_index]=temp;
    }

    
}