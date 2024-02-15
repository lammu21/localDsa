package Leetcode.Array_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Count_2824 {
     public static int countPairs(List<Integer> nums, int target) {
       
        // for (int i = 0, j=0;i < nums.size()&&j < nums.size(); i++, j++) {
            // System.out.print(nums.get(i));
         int numOfPair=0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                
                if(i<j&&nums.get(i)+nums.get(j)<target)
                {
                    numOfPair++;
                }
            }
        }

        return numOfPair;    
            
        }
       
       
       

    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(-6,2,5,-2,-7,-1,3);
         int target=-2;
         System.out.println(countPairs(nums,target));

    }

}

