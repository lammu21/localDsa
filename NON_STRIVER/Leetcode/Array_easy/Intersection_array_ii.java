package Leetcode.Array_easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_array_ii {

 public static void main(String[] args) {
       int[] nums1 = {7,2,2,4,7,0,3,4,5};
        int[] nums2 = {3,9,8,6,1,9};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
     
        Arrays.sort(nums1);
       
        Arrays.sort(nums2);
        ArrayList <Integer> result_list= new ArrayList<>();
         int i=0;
         int j=0;
         int k=0;
           while (i<nums1.length&&j<nums2.length) {
              
              if(nums1[i]<nums2[j]){
                  i++;
              }
             else  if(nums1[i]>nums2[j]){
                  j++;
              }
              else if (nums1[i]==nums2[j])
              {
                  result_list.add(nums1[i]);
                  i++;
                  j++;
              }
           }

           int [] intersection = new int [result_list.size()];
           int index =0;
           for(int num:result_list)
           {
            intersection[index++]=num;
           }
   
           return intersection;
       }
   
   }


   
   
               
   

