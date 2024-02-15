package Leetcode.Array_easy;

public class Guess_number {
   
        public static int guessNumber(int n) {
            int left = 1, right = n;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int result = guess(mid);
                if (result == 0) {
                    return mid;
                } else if (result == 1) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            // This line should not be reached as the guessing game should always end with a correct guess.
            return -1;
        }
    
        // Pre-defined API method
        private static int guess(int num) {
            // This method is predefined. It could be part of an external library or provided by the system.
            // For the purpose of this example, we'll assume it returns -1, 0, or 1 based on the comparison between num and the picked number.
            return 0; // Placeholder return value
        }

        public static void main(String[] args) {
            int n =10;
            System.out.println(guessNumber(n));

        }
    }

    

