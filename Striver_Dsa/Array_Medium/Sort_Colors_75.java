package Striver_Dsa.Array_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sort_Colors_75
 */
public class Sort_Colors_75 {

    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        // List<Integer> zeros=new ArrayList<>();
        // List<Integer> ones=new ArrayList<>();
        // List<Integer> twos=new ArrayList<>();
        // int countOne=0;
        // int countTwo=0;
        // int countzero=0;

        // if(nums.length>1){

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i]==0) {
        //         countzero++;
        //     }
        //     if (nums[i]==1) {
        //         countOne++;
        //     }
        //     if (nums[i]==2) {
        //         // twos.add(nums[i]);
        //         countTwo++;
        //     }

        // }
        // // int start = zeros.size();
        // if (countzero>=1) {
        //     for (int i = 0; i <countzero; i++) {
        //         nums[i]=0;
        //     }
        // }
        
        // // 
        // // if (ones.size()>=1){
        // //   start = zeros.size();
        // //  for (int i = 0; i < ones.size(); i++) {
        // //     nums[start]=ones.get(i);
        // //     start++;
        // //  }
        // if (countOne>=1) {
        //     for (int i = countzero; i <countzero+countOne; i++) {
        //         nums[i]=1;
        //     }
        // }
        // }
        // if (countTwo>=1) {
        //     for (int i = countOne+countzero; i <nums.length; i++) {
        //         nums[i]=2;
        //     }
        // }
        int low = 0;
        int mid=0;
        int high=nums.length-1;
        while (mid<=high) {

            if (nums[mid]==0) {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if (nums[mid]==1) {
                mid++;
            }
            else  {
                swap(nums, mid,high);
                high--;
            }
            
        }
    }

    public static void swap(int []nums, int left , int right){
        int temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }

}

