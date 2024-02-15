package tree;

import java.util.Arrays;

public class ConcatenateArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        ConcatenateArray solution = new ConcatenateArray();

        // Example 1
        int[] nums1 = {1, 2, 1};
        int[] result1 = solution.getConcatenation(nums1);
        System.out.println(Arrays.toString(result1));

        // Example 2
        int[] nums2 = {1, 3, 2, 1};
        int[] result2 = solution.getConcatenation(nums2);
        System.out.println(Arrays.toString(result2));
    }
}