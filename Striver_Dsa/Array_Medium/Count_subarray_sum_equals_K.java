package Array_Medium;

import java.util.HashMap;

public class Count_subarray_sum_equals_K {
    public static void main(String[] args) {
        int []nums = {1,2,3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {

        // int n= nums.length;
        // int count=0;
        // int preSum=0;
        // HashMap <Integer,Integer> mpp= new HashMap<>();
        // mpp.put(0, 1);
        // for (int i = 0; i < nums.length; i++) {
        //     preSum+=nums[i];

        //     int remove = preSum-k;

        //     count+=mpp.getOrDefault(remove, 0);
        //     mpp.put(preSum, mpp.getOrDefault(preSum, 0)+1);

        // }
        // return count;
    HashMap <Integer,Integer> countMap= new HashMap<>();
    int n=nums.length;
    int count=0;
    int preSum=0;
    for(int i=0;i<n;i++){
        preSum+=nums[i];

        int remove=preSum-k;

        count+=countMap.getOrDefault(remove,0);
        countMap.put(preSum,countMap.getOrDefault(preSum,0)+1);
    }
    return count;
}
    }


