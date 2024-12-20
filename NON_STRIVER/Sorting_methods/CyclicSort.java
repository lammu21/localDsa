package Sorting_methods;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {10,9,8,4,7,5,6,2,3,1};
      cyclicSort_method(arr);
    //   System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort_method(int [] arr){
       int i=0;
        while (i<arr.length) {
            if (arr[i]!=i+1) {
                int j=arr[i]-1;
                swap(j, i, arr);
            }
            else{
                i++;
            }
        }
    }



    private static void swap(int max, int last,int []arr) {
        // 
       int temp=arr[max];
       arr[max]=arr[last];
       arr[last]=temp;
    
        
    }
}
