public class Subarray_Sum_Equals_K_560 {

    public static void main(String[] args) {
        int [] nums ={1,1,1};
        int k=2;
        System.out.println(subarraySum(nums, k));
    }
    public static int subarraySum(int[] nums, int k) {
          
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if (sum==2) {
                return i+1;
            }
        }
        return 0;
        
    }
}
