package SubsequencePrograms;

import java.util.ArrayList;
import java.util.List;

public class Subsequence_K_sum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int n = 3;
        int sum=0;
        int req_sum=3;
        List<Integer> ds = new ArrayList<>();
        Subseq_K_sum(0, ds, sum, req_sum, arr,n);
        // printSubsequences(0, ds, sum, req_sum, arr, n);
            }
        
            private static void Subseq_K_sum(int index, List<Integer> ds, int sum, int req_sum, int[] arr, int n) {
                if (index==n) {
                    if(sum==req_sum){
                        for (int it : ds) {
                            System.out.print(it+" ");
                            
                        }
                        System.out.println();
                     
                    }
                    return;

                    
                }
                ds.add(arr[index]);
                sum+=arr[index];
                Subseq_K_sum(index+1, ds, sum, req_sum, arr, n);
                sum-=arr[index];
                ds.remove(ds.size() - 1);
                Subseq_K_sum(index+1, ds, sum, req_sum, arr, n);
            }
        

}


        
    

