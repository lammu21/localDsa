public class Max_Consecutive_Ones_485 {

    public static void main(String[] args) {
        int [] nums ={1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count =0;
        int max=0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]==1) {
                count++;
                max=Math.max(max, count);
                
            }
            else{
                count=0;
            }
          
        }
        return max;
        
        
    }
    
}
