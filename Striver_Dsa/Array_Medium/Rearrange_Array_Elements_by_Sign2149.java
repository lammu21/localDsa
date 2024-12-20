package Array_Medium;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Rearrange_Array_Elements_by_Sign2149
 */
public class Rearrange_Array_Elements_by_Sign2149 {

    public static void main(String[] args) {
        int [] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));

    }

    public static int[] rearrangeArray(int[] nums) {
       int [] ans = new int[nums.length];
       int postive_index=0;
       int negative_index=1;
       for (int i = 0; i < nums.length; i++) {
          if (nums[i]>0) {
             ans[postive_index]=nums[i];
             postive_index+=2;
          }
          if (nums[i]<0) {
            ans[negative_index]=nums[i];
            negative_index+=2;
         }
       }
       return ans;
    }






    // BRUTE_FORCE_METHOD
    //     ArrayList<Integer> pos= new ArrayList<>();
    //     ArrayList<Integer> neg=new ArrayList<>();

    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i]>0) {
    //             pos.add(nums[i]);
                
    //         }
    //         if (nums[i]<0) {
    //             neg.add(nums[i]);
                
    //         }


    //     }

    //     for (int i = 0; i < nums.length/2; i++) {
    //         nums[i*2]=pos.get(i);
    //         nums[i*2+1]=neg.get(i);
    //     }

    //     return nums;
        
    // }
    
}