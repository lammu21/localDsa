package Array_Medium;

public class Max_subarray_SUM_GFG {
  public static void main(String[] args) {
    long [] arr = {4, 3, 1, 5, 6};
    System.out.println(pairWithMaxSum(arr, arr.length));
  }


    public static long pairWithMaxSum(long arr[], long N)
    {
        // Your code goes here
    // long max=Integer.MIN_VALUE;
    // long sum =0;
    // for(int i=0;i<arr.length;i++){
    //     sum+=arr[i];
    //     if(sum>max){
    //         max=sum;
    //     }
    //     if(sum<0){
    //         sum=0;
    //     }
       
    // }
    //  return max;
   long max_sum=Integer.MIN_VALUE;
   long current_sum =0;
   for(int i=0;i<N-1;i++){
       current_sum=arr[i]+arr[i+1];
       max_sum=Math.max(max_sum,current_sum);
   }
   return max_sum;
    }
    
}
