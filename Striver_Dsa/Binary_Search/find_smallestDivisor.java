/**
 * find_smallestDivisor
 */
public class find_smallestDivisor {

    public static void main(String[] args) {
       int [] nums = {1,2,5,9};
       int threshold = 6;
       System.out.println(smallestDivisor(nums,threshold));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
             sum=sum+nums[i];
        } 
        if(sum<threshold){
            return 1;
        }
         
         int start=1;
         int max=Integer.MIN_VALUE;
          n=nums.length;
         for(int i =0;i<n;i++){
            max=Math.max(max, nums[i]);
        }
        
       
         int end = max;
          int result=0;
         while(start<=end){
            int mid= start+(end-start)/2;
            sum=sumOfDivisorByMid(nums,mid);
           
            if(sum<=threshold){
               result=mid;
               end=mid-1;
            }
            else {
                start=mid+1;
            }
         }
         return result;
        
    }
    public static int sumOfDivisorByMid(int[]nums, int mid){
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int value = nums[i]/mid;
            if(value==0){
                sum+=1;
            }else{
            sum=sum+value;
            }
        }
        return sum;
    }

}