package BS_arrays;

import java.util.Arrays;

// https://leetcode.com/problems/intersection-of-two-arrays/description/

public class IntersectionOfTwoArray {

    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[]nums2={9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        
        int [] nums3 = new int [100];

        for(int i=0;i<nums2.length;i++)
        {
           nums3[i]= binarySearch(nums1,nums2[i]);
        }
        return nums3;
    }

     public static int binarySearch(int[] nums1, int target)
     {
         int start=0;
         int end=nums1.length-1;
         int mid =0;
         
         while(start<=end)
         {
             mid = start+(end-start)/2;

             if(nums1[mid]<target)
             {
                 end=mid-1;
             }
             if(nums1[mid]>target)
             {
                 start=mid+1;
             }
            else if (nums1[mid]==target) {
                return mid ;
             }

             
         }

         return -1;
           
         }
     }


