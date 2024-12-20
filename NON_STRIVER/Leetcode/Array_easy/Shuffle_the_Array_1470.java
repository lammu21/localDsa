package Leetcode.Array_easy;

import java.util.Arrays;

/**
 * Shuffle_the_Array_1470
 */
public class Shuffle_the_Array_1470 {

    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
 
     //    int [] arr1=new int[3];
     //    int [] arr2=new int[3];
       int [] result = new int[nums.length] ;
 
       result=shuffle(nums,3);
       System.out.println(Arrays.toString(result));
 
 
 
        
     }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        

        for (int i = 0, j = 0; i < n; i++, j += 2) {
          
            result[j] = nums[i];
            result[j + 1] = nums[i + n];
        }

        return result;
    }
    }
