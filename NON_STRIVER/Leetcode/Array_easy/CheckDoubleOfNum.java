package Leetcode.Array_easy;

import java.util.Arrays;

public class CheckDoubleOfNum {

    public static void main(String[] args) {
        int arr[] ={7,1,14,11};
        System.out.println(checkIfExist(arr));
    }
   
        public static boolean checkIfExist(int[] arr) {
              int count=0;
              Arrays.sort(arr);
            for(int i=0;i<arr.length;i++)
            {
                int target=2*arr[i];
                 int res=binarySearch(arr, target);
                 if (res!=-1&&res!=i) {
                    return true;
                 }
            }
            return false;
    
    
        
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}

