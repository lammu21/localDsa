import java.util.Scanner;

/**
 * Count_Digits
 */
public class Count_Digits {

   public static int evenlyDivides(int N) {
        int count = 0;
        int n=N;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0 && N % digit == 0) {
                count++;
            }

            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 2446;

        int result = evenlyDivides(N);
        System.out.println("Number of digits that evenly divide N: " + result);
    }


}