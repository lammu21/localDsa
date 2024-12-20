package SubsetPrograms;

import java.util.ArrayList;

public class SubsetSums {

    public static void main(String[] args) {
        int arr[] ={2, 3};
        ArrayList<Integer> subsets=subsetSums(arr);

        for (int i = 0; i < subsets.size(); i++) {
           System.out.print(subsets.get(i)+" ");
            
        }

    
    }
  
    public static ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> subsets= new ArrayList<>();
        int N= arr.length;
        subsetSumHelper(0,0,arr,N,subsets);
        return subsets;
    }
   public static void subsetSumHelper(int index,int sum, int []arr,int N, ArrayList<Integer> subsets){
       if(index==N){
           subsets.add(sum);
           return;
       }
       subsetSumHelper(index+1,sum+arr[index],arr,N,subsets);
       subsetSumHelper(index+1,sum,arr,N,subsets);
       
   }
}
    
