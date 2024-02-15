package Leetcode.Array_easy;

import java.util.Arrays;

public class Build_Array_from_Permutation_1920 {
    

    public int[] buildArray(int[] nums) {
        int length_of_array = nums.length;

        int[] array = new int[length_of_array];

        for (int j : nums) {
            array[j]=nums[nums[j]];
        }


        

        for(int i = 0; i<length_of_array;i++)
        {
            System.out.print(array[i]);
        }
      
        
        return array;
        
    }
   


    public static int[] decode1(int[] encoded, int first) {
        
        int [] result = new int[encoded.length+1];
        
        result[0]=first;

        for(int i=0;i<encoded.length;i++)
        {
           result[i+1]=encoded[i]^result[i];
        }
     
        return result;
        
    }

    
    public static void main(String[] args) {
        // int [] nums={0,2,1,5,3,4};

        // int [] nums1={5,0,1,2,3,4};

        // Build_Array_from_Permutation_1920 object1 = new Build_Array_from_Permutation_1920();
        
        // object1.buildArray(nums);
        
        // System.out.println();
        
        // object1.buildArray(nums1);
        
        




        int [] encoded = {6,2,7,3};
       int [] decodedArray=decode1(encoded,4);
       System.out.println(Arrays.toString(decodedArray));
       


    }
}



