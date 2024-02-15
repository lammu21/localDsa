package BS_arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstAndLastPosition {
    public static void main(String[] args) {
       int [] nums = {5,7,7,8,8,10};
       int target = 8;
      List<Integer> res= targetIndices(nums, target);
      
      for (Integer element : res) {
        System.out.println(element);
    }
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int check=-1;

        List<Integer> list1 = new ArrayList<>();
        while(check!=Binary_Search_method(nums,target,start,end,mid))
        {
          list1.add(Binary_Search_method(nums,target,start,end,mid));
        }
        return list1;

    }

    public static int Binary_Search_method(int[] nums, int target,int start,int end, int mid) {

        while (start < end) {
            mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }

        }

        return -1;
    }


   public static int [] searchRange(int []nums,int target)
   {

    int [] result_array = {-1,-1};

    result_array[0]= findFirstPosition_Array(nums,target,true);

    if (result_array[0]!=-1) {
        result_array[1]=findFirstPosition_Array(nums,target,false);
    }
    return result_array;

   }

private static int findFirstPosition_Array(int []nums,int target, boolean First_position) {
    
     int start = 0;
     int end=nums.length-1;
     int mid=0;
     int ans=0;
     while (start<=end) 
     {
        mid = start+(end-start)/2;
        if (nums[mid]<target) 
        {
            end=mid-1;
        }
        if (nums[mid]>target) 
        {
            start= mid+1;
            
        }
        else{
            ans=mid;
            if (First_position) {
                end=mid-1;
            }
            else {
                start = mid+1;
            }
        }

        
     }
  return ans;
}

}