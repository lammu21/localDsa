package Striver_Dsa.Hashing;

import java.util.Arrays;

public class HighestAndLowest {
    
    public static void main(String[] args) {
       int  n = 6;
        // int x = 14; 
        int []arr = {1, 2, 3, 1, 1, 4};
        
        System.out.println(Arrays.toString(getFrequencies(arr)));
    }
    public static int[] getFrequencies(int []nums){
        // Write your code here.
        int n=nums.length;
        int [] hashArray = new int[n];
        for (int i = 0; i <n; i++) {
             
                hashArray[nums[i] ]+=1;
              
    }
    int max=0;
   for (int j = 0; j < hashArray.length; j++) {
    if(hashArray[j]>max)
        {
            
            max=j;
        }
   }
        
    
    int min=0;
    for (int i = 0; i < hashArray.length; i++) {
        if(hashArray[i]<min)
        {
            if (hashArray[i]>0) {
                min=i;
            }
           
        }
    }
       
    // return hashArray;

    int[] res= {max,min};
    return res;
}
}
