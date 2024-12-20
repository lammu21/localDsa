package SubsequencePrograms;
import java.util.ArrayList;
import java.util.List;

public class Subsequence_K_Sum_1 {
    
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int n = 3;
        int sum=0;
        int req_sum=3;
        List<Integer> ds = new ArrayList<>();

        // System.out.println(Subsequence_K_Sum_Count(0, ds, sum, req_sum, arr, n));
        Subsequence_K_Sum_1_method(0, ds, sum, req_sum, arr, n);
        
    }

    public static boolean Subsequence_K_Sum_1_method(int index,List<Integer> ds,int sum, int req_sum,int arr[],int n){
        if(index==n){
            if (sum==req_sum) {
                for (int i : ds) {
                    System.out.print(i +" ");
                    
                }
                System.out.println();
                return true;
                
            }
            else{
                return false;
            }
        }

        ds.add(arr[index]);
        sum+=arr[index];

        if(Subsequence_K_Sum_1_method(index+1, ds, sum, req_sum, arr, n)==true){
            return true;
        }
        sum-=arr[index];
        ds.remove(ds.size()-1);
        if(Subsequence_K_Sum_1_method(index+1, ds, sum, req_sum, arr, n)==true){
            return true;
        }
        return false;

    }

    public static int Subsequence_K_Sum_Count(int index,List<Integer> ds,int sum, int req_sum,int arr[],int n){

        if(sum>req_sum){
            return 0;
        }
        if(index==n){
            if (sum==req_sum) {
                return 1;
            }
            else{
                return 0;
            }
        }

        // ds.add(arr[index]);
        sum+=arr[index];

        int left =Subsequence_K_Sum_Count(index+1, ds, sum, req_sum, arr, n);
        
        sum-=arr[index];
       int right =Subsequence_K_Sum_Count(index+1, ds, sum, req_sum, arr, n);
      
        return left+right;

    }

}
