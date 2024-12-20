package Striver_Dsa.Hashing;

import java.util.Arrays;

public class Count_frequency_inrange {
    public static void main(String[] args) {
       int  n = 10;
        int x = 14; 
        int []arr = {11,14,8,3,12,14,1,7,4,3};
        
        System.out.println(Arrays.toString(countFrequency(n, x, arr)));
    }
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int [] hashArray = new int[n];
        for (int i = 0; i <n; i++) {
              if (nums[i]==1) {
                hashArray[0]+=1;
              }
              else if(nums[i]-1<n)
              {
                hashArray[nums[i]-1]+=1;
               }
        
    }
    return hashArray;
}
}

// public static int[] countFrequency(int n, int x, int []nums){

//     // Write your code here.
    
//     int[] ans = new int[n];
    
//     Arrays.fill(ans, 0);
    
     
    
//     for(int i=0; i<n; i++)
    
//     {
    
//     // this will be the index of our returning array
    
//     int currnum = nums[i] -1;
    
//     if(currnum < n)
    
//     {
    
//     int count = ans[currnum - 1];
    
//     ans[currnum -1] = ++count;
    
//     }
    
//     }
    
//     return ans;
    
//     }
    
     
    
//     }

