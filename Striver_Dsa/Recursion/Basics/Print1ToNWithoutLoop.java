package Basics;
public class Print1ToNWithoutLoop {
    public static void main(String[] args) {
        printNos(10);
    }
    public static void printNos(int n) {
        // Your code here
        
        if(n==0){
           return;
        }
      
        printNos(n-1);
        System.out.print(n);
    }
}
