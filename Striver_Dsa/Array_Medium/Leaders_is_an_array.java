package Striver_Dsa.Array_Medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Leaders_is_an_array {
    public static void main(String[] args) {
        int [] arr= {16,17,4,3,5,2};
        ArrayList <Integer> list=leaders(arr, arr.length);
        
        for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i));

        }
        
        
    }
     static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        // BRUTE_FORCE O(N^2)
        ArrayList <Integer> list = new ArrayList<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         boolean leader = true;
    //         for (int j = i+1; j < arr.length; j++) {
    //             if (arr[i]<arr[j]) {
    //                 leader=false;
    //             }
    //         }
    //         if (leader==true) {
    //             list.add(arr[i]);
    //         }
            
    //     }
    //     return list;
        
        
    // }

    // OPTIMAL_METHOD O(N)
    // int le =arr.length;
    int max=Integer.MIN_VALUE;
    for (int i = n-1; i>=0; i--) {
        
        if(max<arr[i]){
          max=arr[i];
          list.add(arr[i]);
        }
    }
    // Collections.sor
    ArrayList <Integer> result= new ArrayList<>();
    // Collections.reverse(list);
    for (int i = list.size()-1; i >=0; i--) {
        result.add(list.get(i));
    }
    return result;


    
}
}
// private static void reverse(int[] arr, int low, int high) {
//     while (low < high) {
//       int temp = arr[low];
//       arr[low] = arr[high];
//       arr[high] = temp;
//       low++;
//       high--;
//     }
// }
