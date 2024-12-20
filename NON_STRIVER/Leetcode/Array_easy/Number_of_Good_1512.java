package Leetcode.Array_easy;

public class Number_of_Good_1512 {
    public static int numIdenticalPairs(int[] nums) {
       
        // int count=0;
        //  for (int i = 0; i < nums.length; i++) {
            
        //     for (int j = i+1; j < nums.length; j++) {
                
        //         if (nums[i]==nums[j]) {
        //             count++;
        //         }
        //     }
        //  }

        int[] freq = new int[101];
        for(int val : nums) {
            freq[val]++;
            System.out.println(val);

        }
        int count=0;
        for(int i=1;i<101;i++) {
            if(freq[i] != 0) {
                count += (freq[i] * (freq[i] - 1))/2;
            }
        }

          return 0;

       
        // return count;
    }
        
        
        
        
        
    public static void main(String[] args) {
      int [] nums = {1,2,3,1,1,3};
     System.out.println(numIdenticalPairs(nums));
     
     
    }
}
