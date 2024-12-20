package Arrays_easy;

import java.util.HashMap;

public class LOngest_subarray {
    public static void main(String[] args) {
        int [] a= {10, 5, 2, 7, 1, 9};
        int k =15;
        System.out.println(lenOfLongSubarr(a,a.length-1,k));
    }

    // public static int longestSubarrayWithSumK(int []a, long k) {
    //     // Write your code here
    //     int longest=0;
    //     for (int i = 0; i <=a.length-1; i++) {
    //         for (int j = i; j < a.length; j++) {
    //             int sum=0;
    //             for (int j2 = i; j2 <=j; j2++) {
    //               sum=sum+a[j2];
    //               }
    //               if(sum==k){
    //                 // longest++;
    //                 longest=Math.max(longest, j-i+1);
                    
    //             }
    //         }
            
    //     }
    //     return longest;
    // }

    public static int lenOfLongSubarr (int A[], int N, int K) {
    //     int left=0;
    //     int right=0;

    //     int sum =A[0];
    //     int longest=0;

    //     while (right<N) {

    //         while (left<=right&&sum>K) {

    //             sum=sum-A[right];
    //             left++;
                
    //         }
    //         if (sum==K) {
    //             longest=Math.max(longest, right-left+1);
                
    //         }
    //         if (sum<K) {
    //             right++;
    //             sum=sum+A[right];
                
    //         }
            
    //     }
    //     return longest;
    // }


     HashMap<Integer,Integer>PrefixSum= new HashMap<>();
     int sum=0;
     int maxlen=0;
     for (int i = 0; i < A.length; i++) {
        sum+=A[i];

        if (sum==K) {
            maxlen=Math.max(maxlen, i+1);
        }

        if (PrefixSum.containsKey(sum-K)) {
            int len=i-PrefixSum.get(sum-K);
            maxlen=Math.max(maxlen,len);
        }
        if (!PrefixSum.containsKey(sum)) {
            PrefixSum.put(sum,i);
        }
     }
     return maxlen;
    }
    
}
