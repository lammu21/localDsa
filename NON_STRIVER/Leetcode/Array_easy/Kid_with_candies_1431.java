package Leetcode.Array_easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Kid_with_candies_1431
 */
public class Kid_with_candies_1431 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List <Boolean> results = new ArrayList<>();
        
        int max = candies[0];

        for (int i = 0; i < candies.length; i++) {
            


            if (candies[i]>max)
            {
                max=candies[i];
            }
       
        }

        // System.out.println(max);

        for (int i = 0; i < candies.length; i++) {
            
            if (candies[i]+extraCandies>=max) 
            {
                results.add(true);
                
            }
            else{
                results.add(false);
            }
        }
        
        
        return results;
        
    }

    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
       System.out.println(kidsWithCandies(candies,extraCandies));
    }
}