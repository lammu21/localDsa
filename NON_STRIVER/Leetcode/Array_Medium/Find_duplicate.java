package Leetcode.Array_Medium;

/**
 * Find_duplicate
 */
public class Find_duplicate {

    public static void main(String[] args) {
        int [] nums {}
    }
    public int findDuplicate(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    return nums[j];
                }
            }
        }
        return 0;
    }
}