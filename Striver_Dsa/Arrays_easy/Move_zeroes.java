package Arrays_easy;

import java.util.Arrays;

/**
 * Move_zeroes
 */
public class Move_zeroes {

    public static void main(String[] args) {
        int [] nums={1,0,1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int zero_Pointer =-1;
        for (int i = 0; i < nums.length; i++) {
          if(nums.length<=1)
          {
              break;
          }
          if (nums[i]==0) {
              zero_Pointer=i;
              break;
          }
        }
        if(zero_Pointer!=-1){
        for (int i = zero_Pointer+1; i < nums.length; i++) {
            if(nums.length<=1)
          {
              break;
          }
          if (nums[i]!=0) {
               
  
              int temp=nums[i];
              nums[i]=nums[zero_Pointer];
              nums[zero_Pointer]=temp;
              zero_Pointer++;
              
          }
        }
        }
    }
}