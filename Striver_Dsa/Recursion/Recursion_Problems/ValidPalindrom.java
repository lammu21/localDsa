package Striver_Dsa.Recursion_Problems;

public class ValidPalindrom {

    public static void main(String[] args) {
       String s = "race a car";
       System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        char[] ch = str.toCharArray();
        int i=0;
        int n= ch.length-1;
       return recuriveFunction(i,n,ch);
       
   }

   public static boolean recuriveFunction(int i,int n, char[] ch){
      if (i>=ch.length/2) {
        return true;
      }
      if (ch[i]!=ch[n]) {
        return false;
      }
      return recuriveFunction(i+1,n-1,ch);
   }
}
