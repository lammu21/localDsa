package Striver_Dsa.Array_Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class two_sum {
   public static void main(String[] args) {
    int [] arr={2,7,11,15};
    int target=9;
    System.out.println(Arrays.toString(twoSum(arr,target)));

   }
   
    public static int[] twoSum(int[] numbers, int target){
   
//    Brute force solution 

 // time complexity O(n^2) and space O(n)
    // {
    //     int [] res = new int [2];
    //    for(int i=0;i<numbers.length;i++)
    //    {
    //        binarySearch(numbers,target,i);
    //    }
    //    return res;
     
    // }

    // private static int [] binarySearch(int[] numbers, int target, int i) {
    //    int start =i+1;
    //    int end=numbers.length;
    //    int mid=0;
    //    while (start<=end&&i<numbers.length) {
    //     mid=start+(end-start)/2;
    //    int res=numbers[i]+numbers[mid];

    //     if(res==target){
    //         return new int []{i,mid};
    //     }
    //     if(res>target){
    //         start=mid+1;
    //     }
    //     else{
    //         end=mid-1;
    //     }
        
    //    }
    // return new int []{-1,-1};

    // }

    // using hashing 
    // time complexity O(n) and space O(n)



    Map<Integer, Integer> map = new HashMap<>();


    for (int i = 0; i < numbers.length; i++) {
        int remaining = target-numbers[i];

        if (map.containsKey(remaining)) {
            return new int[] {map.get(remaining),i};
            
        }
        map.put(numbers[i],i );
        
    }
    return new int[] {-1,-1};
    
        
    

    }


   
}
