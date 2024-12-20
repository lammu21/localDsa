package Array_Medium;

import java.util.Arrays;

public class Find_First_andLast_Position {
    public static void main(String[] args) {
        int [] nums = {2,2};
        // System.out.println("started");
        int [] result =searchRange(nums, 2);
       System.out.println(Arrays.toString(result));
    }


    // public static int[] searchRange_brute_Force(int[] nums, int target) {
    //     int [] result = {-1,-1};
    //     int count =0;
    //     // int start =0;
    //     // int end =nums.length-1;
    //     // int mid=0;

    //     for (int i = 0; i < nums.length; i++) {
            
    //         if(nums[i]==target)
    //         {
    //             count++;
    //             if (count==1) {
    //               result[0]=i;
    //             }
    //             result[1]=i;
    //         }
            
    //     }
    //     return result;
    // }
 public static int[] searchRange(int[] nums, int target) {

    
    int left = left_binary_search(nums, target);
    int right = right_binary_search(nums, target);
    int[] res= {right, left};

    if(nums.length==1&&(res[0]!=-1||res[1]!=-1))
    {
        res[0]=0;
        res[1]=0;
    }
    return  res;

}

private static int right_binary_search(int[] nums, int target) {
    int start = 0;
    int end = nums.length;
    int mid = 0;
    int index = -1;

    while (start <= end) {
        mid = start + (end - start) / 2;

        if (mid >= 0 && nums[mid] == target) {
            index = mid;
            end = mid - 1;
        } else if (mid >= 0 && nums[mid] > target) {
            end = mid - 1;
        } else {

            start = mid + 1;
        }

    }
    return index;

}

public static int left_binary_search(int[] nums, int target) {
    int start = 0;
    int end = nums.length;
    int mid = 0;
    int index = -1;

    while (start <= end) {
        mid = start + (end - start) / 2;

        if (mid < nums.length && nums[mid] == target) {
            index = mid;
            start = mid + 1;
        }

        if (mid < nums.length && nums[mid] > target) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }

    }
    return index;

}
}


