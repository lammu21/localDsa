package Striver_Dsa.Recursion_Problems;

import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args) {
        int [] nums={3,1,1,7,4,2,6,11};
        int n=8;
        reverseArray(n,nums);
        System.out.println(Arrays.toString(nums));
    }

    
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int i=0;
        recursivefunction(i, n-1, nums);

         return nums;
         
    }
     public static void recursivefunction(int i,int n,int []arr)
     {
         if (i>=n) {
             return;
         }
         swap(i,n,arr);
         recursivefunction(i+1,n-1,arr);
     }

     public static void swap(int i, int n,int[]arr){
         int temp=arr[i];
         arr[i]=arr[n];
         arr[n]=temp;
     }


}
