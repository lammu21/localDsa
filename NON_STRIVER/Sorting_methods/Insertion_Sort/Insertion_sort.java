package Sorting_methods.Insertion_Sort;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int [] arr= {-1,-2,-5};
        insertion_sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void insertion_sort(int [] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1])
                {
                    int temp_variable=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp_variable;
                }
                else break;
            }
        }
    }
}
