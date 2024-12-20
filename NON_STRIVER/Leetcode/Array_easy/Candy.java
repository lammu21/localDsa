package Leetcode.Array_easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Candy {
    public static void main(String[] args) {
        int []arr = {1,3};
        int [] arr1={2};
        System.out.println(Arrays.toString(fairCandySwap(arr, arr1)));

    }
    // public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    //     int len= Math.max(aliceSizes.length,bobSizes.length);
    //     int limit=Math.min(aliceSizes.length,bobSizes.length);
    //     int [] res = new int [len];

    //     for(int i=0;i<len;i++)
    //     {
    //         int j=1;
    //         if(i<=limit&&j<=limit)
    //         if(aliceSizes[i]+bobSizes[i]==aliceSizes[j]+bobSizes[j])
    //         {
    //             res[0]=aliceSizes[i];
    //             res[1]=bobSizes[i];
    //         }
    //         else if (aliceSizes[i]+bobSizes[i]==aliceSizes[j]){
    //             res[0]=aliceSizes[i];
    //             res[1]=bobSizes[i];
    //         }
    //         else if (aliceSizes[i]+bobSizes[i]==bobSizes[j]){
    //             res[0]=aliceSizes[i];
    //             res[1]=bobSizes[i];
    //         }
    //     }
    //     return res;

    // }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // Calculate the total number of candies Alice and Bob have
        int totalAlice = 0, totalBob = 0;
        for (int candy : aliceSizes) {
            totalAlice += candy;
        }
        for (int candy : bobSizes) {
            totalBob += candy;
        }
        
        // Calculate the target candy amount for each person after exchange
        int target = (totalAlice + totalBob) / 2;
        
        // Create a HashSet to store Bob's candy sizes
        Set<Integer> bobCandies = new HashSet<>();
        for (int candy : bobSizes) {
            bobCandies.add(candy);
        }
        
        // Iterate through Alice's candies to find the required exchange
        for (int aliceCandy : aliceSizes) {
            int bobCandy = target - (totalAlice - aliceCandy);
            if (bobCandies.contains(bobCandy)) {
                return new int[]{aliceCandy, bobCandy};
            }
        }
        
        // If no valid exchange is found, return an empty array
        return new int[]{};
    }
}


