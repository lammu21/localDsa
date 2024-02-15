package BS_arrays;

public class Squart {
    
    public static void main(String[] args) {
        int num=808201;

        // System.out.println(Math.floor(num));
       System.out.println( isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num/2;
        long mid = 0;
        if (num == 1) {
            return true;
        }

        while (start <= end) {

            mid = start + (end - start) / 2;

            if (mid * mid < num) {
                start = mid + 1;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else  {
                // mid =Math.floor(mid);
                if (mid*mid==num) {
                    return true;
                }
               
            }
        }
        return false;
    }

//     public static boolean isPerfectSquare(int num) {
//         double sqrt = Math.sqrt(num);
//         return sqrt == Math.floor(sqrt);
//     }
// }
}

