package Leetcode.Array_easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Left_and_Right_Sum_Differences2574 {
    
    public static int[] leftRightDifference(int[] nums) {
       
        int [] result=new int[nums.length];
        result[0] =0;
        int sum=0;
       for (int i = 0; i < nums.length-1; i++) {
        sum=sum+nums[i];
        result[i+1]=sum;
        // System.out.println(result[i]);
       }
        sum=0;
        int [] result1=new int[nums.length];
        result1[nums.length-1] =0;
       for (int i = result.length-1; i >0 ; i--) {
        sum=sum+nums[i];
        result1[i-1]=sum;
        // System.out.println(result1[i]);

       }
       
    //     
    //   int i =1;
    //   int j=0;
    // while (i!=nums.length) {
    //     result[i]=nums[i]+nums[j];
    //     j=i;
    //     i++;
    // }
     int [] final_result= new int[result.length];
for (int i = 0; i < result1.length; i++) {
    final_result[i]=Math.abs(result[i]-result1[i]);
}
    return final_result; 
    }

    public static void main(String[] args) {
        int []nums={10,4,8,3};
    //   int []  results =leftRightDifference(nums);

    // //   System.out.println(Array.toString(results));
    //    System.out.println(Arrays.toString(results));
    int x=4;

    System.out.println(Math.sqrt(x));

    // Math.round(Math.sqrt(x))


    }
}
