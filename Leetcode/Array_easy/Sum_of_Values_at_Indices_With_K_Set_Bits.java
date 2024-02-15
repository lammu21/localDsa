package Leetcode.Array_easy;

import java.util.ArrayList;
import java.util.List;

public class Sum_of_Values_at_Indices_With_K_Set_Bits {
    
     public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int count =0;
        List<Integer> results =new  ArrayList<>();
       for (int i = 0; i < nums.size(); i++) {
        String binary =Integer.toBinaryString(i);
        char[] charArray = binary.toCharArray();
        for (int j = 0; j < charArray.length; j++) {
            if (charArray[j]=='1') 
            {
                count++;
            }
            
        }
        if (count==k) 
        {
           results.add(i);
        }
            
        }
        for (int element : results) {
            System.out.println(element);
        }
        // System.out.println(binary);
        return k;
       }
       
     
        
    



    public static void main(String[] args) {
        // List <Integer> nums = new ArrayList<>();
        List<Integer> nums = List.of(5,10,1,5,2);
        sumIndicesWithKSetBits(nums, 1);

    }
}

