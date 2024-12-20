package Basics;
public class IsPalindrome {
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
        int i =0;
        return isPalindromeRecursiveFunction(i,s);

        
    }
      public static boolean isPalindromeRecursiveFunction(int i, String s){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }

           return isPalindromeRecursiveFunction(i+1,s);

     

      }
}
