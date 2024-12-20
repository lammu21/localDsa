package Leetcode.Array_easy.Array_medium;

import java.util.ArrayList;
import java.util.List;

public class Foursum {
    public static void main(String[] args) {
        
    }

     public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list1= new ArrayList<>();
        List<Integer> row_list= new ArrayList<>();
        int limit=4;
        int sum=-1;
        int i = 0;

     while(i < limit) {
        sum=+i;
        row_list.add(nums[i]);
        i++;
     
     if (sum==target) {
        if (!row_list.isEmpty()) {
            list1.add(row_list);
        }
     }

       
    }

    
}
}
