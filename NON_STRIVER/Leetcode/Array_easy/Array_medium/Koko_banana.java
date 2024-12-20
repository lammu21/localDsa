package Leetcode.Array_easy.Array_medium;

import java.util.ArrayList;

public class Koko_banana {


    public static void main(String[] args) {
        int [] piles ={30,11,23,4,20};
        int hours=5;
        System.out.println(minEatingSpeed(piles, hours));

        List<T> list1= new ArrayList<>()
    }
    public static int minEatingSpeed(int[] piles, int h) 
        {

            int low =1;
            int high=maxElement(piles);
            int mid=0;
            while(low<=high)
            {
                mid=low+(high-low)/2;
                int hours_per_mid=hoursCalc(piles,mid);
                if(hours_per_mid<=h)
                {
                    high=mid-1;
                }
                else {
                    low =mid+1;
                }
            }
            return low;
         }
            
         public static int maxElement(int[]piles){
               int maxElement = piles[0];
     
             // Iterate through the array starting from the second element
             for (int i = 1; i < piles.length; i++) {
                 // If the current element is greater than maxElement, update maxElement
                 if (piles[i] > maxElement) {
                     maxElement = piles[i];
                 }
             }
             return  maxElement;
         }
     
      public static  int hoursCalc(int [] piles,int mid)
         {
             double result=0;
             for(int i=0;i<piles.length;i++)
             {
                 result=result+Math.ceil((double)piles[i]/(double)mid);
             }
             int res1= (int)result;
             return res1;
         }
     
}

          
        