package Leetcode.Array_easy.Array_medium;

import java.util.Arrays;

/**
 * Right_interval
 */
public class Right_interval {

    public static void main(String[] args) {
        int [][] intervals={{1,1},{3,4}};
         System.out.println(Arrays.toString(findRightInterval(intervals)));
    }
    public static int[] findRightInterval(int[][] intervals) {
       
        
        int n = intervals.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            int minIndex = -1;
            int minStart = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (i != j && intervals[j][0] >= intervals[i][1] && intervals[j][0] < minStart) {
                    minStart = intervals[j][0];
                    minIndex = j;
                }
            }
            result[i] = minIndex;
        }
        
        return result;
    }

}