package Leetcode.Array_easy.Array_medium;

public class Minimum_element_in_rotated_array {
   
   public static void main(String[] args) {
    int []nums ={3,4,5,1,2};
    System.out.println(findMin(nums));
   }
   
    public static int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid =0;
        int ans = Integer.MAX_VALUE;

        while(start<=end)
        {

            mid = start+(end-start)/2;


            if(nums[start]<nums[mid])
            {
                ans=Math.min(ans,nums[start]);
                start=mid+1;
            }
            else 
            {
                ans=Math.min(nums[mid],ans);
                end=mid-1;
            }

        }
        return ans;
    }
}
