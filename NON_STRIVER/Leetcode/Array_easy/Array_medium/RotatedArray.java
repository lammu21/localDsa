package Leetcode.Array_easy.Array_medium;

public class RotatedArray {

    public static void main(String[] args) {

        int [] nums = {1,3};
        int target =3;
        System.out.println(search(nums, target));

        
    }
   
    
        public static int search(int[] nums, int target) {
    
            int start = 0;
            int end = nums.length - 1;
            int mid = 0;
            if (nums.length == 1) {
                if(nums[0]==target){
                    return 0;
                }
                else {
                return -1;
                }
            }
    
            while (start <= end) {
                mid = start + (end - start) / 2;
    
                if (nums[mid] == target) {
                    return mid;
                }
                if (nums[start]<=nums[mid]) {
                    if (nums[start] <= target && nums[mid] > target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                else{
                    if(nums[mid]<target&&nums[end]>=target)
                    {
                        start=mid+1;
                    }
                    else {
                        end=mid-1;
                    }
                }
    
            }
            return -1;
        }
    }
    


