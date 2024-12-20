package Striver_Dsa.Sorting;

import java.util.Arrays;

/**
 * selection_sort
 */
public class selection_sort {

    public static void main(String[] args) {
        int [] arr= {2,13,4,1,3,6,28};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        //Your code goes here
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max_index=find_max_index(arr,0,last);
            swap(arr,last,max_index);
            }
    }
            public static int find_max_index(int[] arr,int first,int last){
                    int max=first;
                    for (int i = 0; i <=last; i++) {
                        if (arr[i]>arr[max]) {
                           max=i;
                    }

                    }
                    return max;
                    
            }
            public static void swap(int [] arr, int last,int max_index){
                  int temp =arr[max_index];
                  arr[max_index]=arr[last];
                  arr[last]=temp;
            }


            
}