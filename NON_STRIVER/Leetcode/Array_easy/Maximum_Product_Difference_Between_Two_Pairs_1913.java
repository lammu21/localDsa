package Leetcode.Array_easy;

import java.util.Arrays;

public class Maximum_Product_Difference_Between_Two_Pairs_1913 {
    
    public static void findMaxMin(int[] arr) {

    }
    public static void main(String[] args) {
        // Example usage
        // int[] array = {5,6,2,7,4};
        int[] nums = {4,2,5,9,7,4,8};
        

        Arrays.sort(nums);


        int min =0;
        int max=0;
        int result=0;
        int len=nums.length;

        min =nums[0]*nums[1];
        max=nums[len-1]*nums[len-2];

        result=(nums[len-1]*nums[len-2])-(nums[0]*nums[1]);

        System.out.println(result);

        // for(int i = 0; i<array.length;i++)
        // {
        //     // System.out.print(array[i]);

        //     min=a[]
            
        // }
        
    }
}
