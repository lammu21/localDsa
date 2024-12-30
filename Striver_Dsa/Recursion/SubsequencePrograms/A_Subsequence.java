package SubsequencePrograms;

import java.util.*;

public class A_Subsequence {

    // Concept

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

    // Problem -- Print all subsequences/Power Set 

    public List<List<Integer>> subsets(int[] nums) {
        
        int n = nums.length;
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> listOfLists = new ArrayList<>();
        generateSubsets(0, ds, nums, n, listOfLists);
        return listOfLists;
    }

    public static void generateSubsets(int ind, List<Integer> ds, int[] arr, int n, List<List<Integer>> listOfLists) {
        if (ind == n) {
            listOfLists.add(new ArrayList<>(ds));
            return;
        }

        // Include the current element
        ds.add(arr[ind]);
        generateSubsets(ind + 1, ds, arr, n, listOfLists);
        
        // Exclude the current element
        ds.remove(ds.size() - 1);
        generateSubsets(ind + 1, ds, arr, n, listOfLists);
    }

  

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int n = 3;
        List<Integer> ds = new ArrayList<>();
        printF(0, ds, arr,n);
    }
}

