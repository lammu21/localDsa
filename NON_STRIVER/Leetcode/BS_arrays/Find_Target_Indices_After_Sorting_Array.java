package BS_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Target_Indices_After_Sorting_Array {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        List<Integer> res = targetIndices(nums, target);

        for (Integer element : res) {
            System.out.println(element);
        }
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int mid;
        List<Integer> list1 = new ArrayList<>();

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                // Found the target, now find the leftmost and rightmost occurrences
                int left = mid;
                while (left > 0 && nums[left - 1] == target) {
                    left--;
                }
                int right = mid;
                while (right < nums.length - 1 && nums[right + 1] == target) {
                    right++;
                }
                list1.add(left);
                list1.add(right);
                return list1;
            }
        }

        // Target not found
        return Arrays.asList(-1, -1);
    }
}

