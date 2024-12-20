package permutation_problems;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
       int [] nums = {1,2,3};
       ArrayList<ArrayList<Integer>> ans = permute(nums);
       for (List<Integer> innerList : ans) {
        for (int num : innerList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

        
    
    public static ArrayList<ArrayList<Integer>>permute(int [] nums){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds= new ArrayList<>();
        boolean [] freq = new boolean[nums.length];
        recursivePermutation(nums,ans,ds,freq);
        return ans;

    }

    public static void recursivePermutation(int[] nums, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds,boolean[] freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i]= true;
                ds.add(nums[i]);
                recursivePermutation(nums, ans, ds, freq);
                freq[i]=false;
                ds.remove(ds.size()-1);
                
            }
            
        }

    }
    
}
