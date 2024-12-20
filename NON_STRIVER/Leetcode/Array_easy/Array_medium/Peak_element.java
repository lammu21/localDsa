package Leetcode.Array_easy.Array_medium;

public class Peak_element {


    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
       

            int start = 0;
            int end = nums.length - 1;
            int mid = 0;
    
            if (nums.length == 1) {
                return 0;
            }
         
            while (start <= end) {
                mid = start + (end - start) / 2;
    
                if (mid == 0  ) {
                    if(nums[mid] > nums[mid + 1]){
                    return mid;
                    }
                    else {
                        return mid+1;
                    }
                }
                if (mid == nums.length-1) {
                    if(nums[mid] > nums[mid - 1]){
                    return mid;
                    }
                 else {
                    return mid - 1;
                }
                }
    
                if (mid >0 && nums[mid - 1] < nums[mid]&&mid < nums.length-1&& nums[mid] >nums[mid + 1] ) {
                    return mid;
    
                } else if (nums[start] <=nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
    
            }
            return mid;
        }
    
}