package Leetcode.Array_easy;

public class Smaller_Than_Current1365 {
    

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        
        int [] results = new int[nums.length];
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            
            for (int j = 0; j < nums.length; j++) {
                if (nums[j]<nums[i]&&i!=j) 
                {
                    count++;
                    
                }
                
            }
            results[i]=count;
            count=0;
        }
        
        return results;
        
    }

    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
         int [] results = new int[nums.length];
       results= smallerNumbersThanCurrent(nums);
      for (int i = 0; i < results.length; i++) {
        
        System.out.println(results[i]);
      }
      

    }
}
