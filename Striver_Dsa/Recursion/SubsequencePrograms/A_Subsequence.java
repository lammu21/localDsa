package SubsequencePrograms;

import java.util.*;

public class A_Subsequence {

    public static void printF(int ind, List<Integer> ds, int[] arr, int n) {
        if(ind==n){
            for (int i : ds) {
                System.out.print(i+" ");
            }
            if(ds.size()==0){
                System.out.println("{}");
            }
            System.out.println();
            return;
        }
        ds.add(arr[ind]);
        printF(ind+1, ds, arr, n);
        ds.remove(ds.size()-1);
        printF(ind+1, ds, arr, n);
    }

  

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int n = 3;
        List<Integer> ds = new ArrayList<>();
        printF(0, ds, arr,n);
    }
}

