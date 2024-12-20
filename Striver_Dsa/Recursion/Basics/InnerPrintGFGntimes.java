package Basics;
public class InnerPrintGFGntimes {
    public static void main(String[] args) {
        printGfg(5);
            }
   
        
static void printGfg(int N) {
       int count=N;
        // code here
        if(count==0){
            return;
        }
        System.out.print("GFG"+""+" ");
        count--;
        printGfg(count);
    }
}
    

