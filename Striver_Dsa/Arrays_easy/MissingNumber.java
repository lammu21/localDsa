public class MissingNumber {

    public static void main(String[] args) {
        int[] nums= {2,2,1};
        System.out.println(missingNumber(nums));


    }

    public static int missingNumber(int[] nums) {

        int n=nums.length;
        int requried_sum=(n*(n+1)/2);
        int acutal_sum=0;
        
        for (int i = 0; i < nums.length; i++) {
            acutal_sum+=nums[i];
        }

        return requried_sum-acutal_sum;
       
    }

}
