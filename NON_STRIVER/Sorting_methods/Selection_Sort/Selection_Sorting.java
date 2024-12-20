package Sorting_methods.Selection_Sort;

import java.util.Arrays;

public class Selection_Sorting {
    

    public static void main(String[] args) {
    int [] arr = {5,8,6,9,5,125,269,8525,};
      selection(arr);
    //   System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr));
}


public static int [] selection_Sorting_method(int [] arr)
{
    for (int i =0; i<arr.length-1-1; i++) {
        int last = arr.length-i-1;
       int max=findMaxElement(arr,0,last);
       swap(max,last,arr);
    //    System.out.print(max);
    }
    return arr;
}


private static void swap(int max, int last,int []arr) {
    // 
   int temp=arr[max];
   arr[max]=arr[last];
   arr[last]=temp;

    
}


private static int findMaxElement(int[] arr, int start,int end ) {
    int max =start;
    int max_index =start;
    for (int i = start; i < end; i++) {
        
        if(arr[i]>max)
        {
            // max=arr[i];
            max_index=i;
        }
    }
    return max_index;
}

static void selection(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        // find the max item in the remaining array and swap with correct index
        int last = arr.length - i - 1;
        int maxIndex = getMaxIndex(arr, 0, last);
        swap(arr, maxIndex, last);
    }
}

static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}

static int getMaxIndex(int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
        if (arr[max] < arr[i]) {
            max = i;
        }
    }
    return max;
}
}
