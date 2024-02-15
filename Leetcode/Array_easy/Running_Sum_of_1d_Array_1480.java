package Leetcode.Array_easy;

public class Running_Sum_of_1d_Array_1480 {
    // public static int[] runningSum(int[] nums) {
    //     int [] results = new int[100];
    //       int sum=0;
    //    for (int i = 0; i < nums.length; i++) {
            
    //         //   results[i]=(nums[i]*(nums[i]+1))/2;
    //         for (int j = 0; j <=i; j++) {
    //             sum=sum+nums[j];
    //         }
    //         results[i]=sum;
    //         sum=0;
    //     }
    //     return results;

    //    }

    
        public static int[] runningSum(int[] nums) {
            for(int i = 1; i < nums.length; i++){
                nums[i] += nums[i - 1];
            }
            return nums;
        }
    
       
       
       

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
          int[] results = runningSum(nums);
          for (int j = 0; j < results.length; j++) 
           {
            System.out.println(results[j]);
          }
    }
}
