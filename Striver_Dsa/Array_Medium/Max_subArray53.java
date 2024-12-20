package Striver_Dsa.Array_Medium;

/**
 * Max_subArray53
 */
public class Max_subArray53 {

    public static void main(String[] args) {
        int []nums = {4,3,1,5,6};
        int [] nums1={-2,1,-3,4,-1,2,1,-5,4};
        // System.err.println(maxSubArray(nums));
        maxSubArray(nums);

    }

    public static int maxSubArray(int[] nums) {
    //     //Brute method 
    //     int max_number = Integer.MIN_VALUE;
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i; j < nums.length; j++) {
    //             int sum =0;
    //             for (int j2 = i; j2 <= j; j2++) {
    //                 sum+=nums[j2];

    //             }
    //             max_number=Math.max(max_number, sum);
    //         }
    //     }
    //     return max_number;
    // }

    // bETTER  solution 
//     int max_number = Integer.MIN_VALUE;
//         for (int i = 0; i < nums.length; i++) {
//             int sum =0;
//             for (int j = i; j < nums.length; j++) {
                
               
//                     sum+=nums[j];

                
//                 max_number=Math.max(max_number, sum);
//             }
//         }
//         return max_number;
// }
    //    int sum = 0;
    //    int max= Integer.MIN_VALUE;
    //   for (int j = 1; j < nums.length; j++) {
      
    //         sum+=nums[j];
         
    //      if (sum>max) {
    //         max=sum;
    //      }
    //      if (sum<0) {
    //         sum=0;
            
    //      }
       
    //      }
       

      
    // return max;
    int max=Integer.MIN_VALUE;
    int sum =0;
    int start=-1;
    int end=-1;
    int dummy_start =-1;
    int len=0;
    int res_len=0;
    for(int i=0;i<nums.length;i++){
        if(sum==0) dummy_start =i;
        sum+=nums[i];
        if(sum>max){
            max=sum;
            
            start=dummy_start;
            end= i;
            len=end-start;
            res_len=Integer.min(len, end-start);


        }
        if(sum<0){
            sum=0;
            
        }
       
    }
    System.out.println(start+"----------"+end+"--"+len);
    // return max;
    return 0;


}
}