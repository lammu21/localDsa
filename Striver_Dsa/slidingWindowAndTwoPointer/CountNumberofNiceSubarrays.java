public class CountNumberofNiceSubarrays {
    public static void main(String[] args) {
        int [] nums={1,1,2,1,1};
        int k=3;

        System.out.println(numberOfSubarrays(nums,k));
    }


    public static int numberOfSubarrays(int[] nums, int k) {
        int l=0,r=0,oddcount=0,subarraycount=0;
        while(r<nums.length){
            if(nums[r]%2==1){
                oddcount++;
            }
            if(oddcount==k){
                subarraycount++;
            }
            if(oddcount>k){
                l=l+1;
                oddcount--;
            }
            r++;
        }
        return subarraycount;
        
    }
    
}
