package Leetcode.Array_easy;

public class square_root {
    public static void main(String[] args) {
        int x=2147395599;

        System.out.println(mySqrt(x));

    }
    
    public static int mySqrt(int x) {

      
        int start = 1;
        int end = x;
        int mid = 0;
        int ans = 1;

        if(x<=1)
        {
            return x ;
        }
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return ans;

    }
}
