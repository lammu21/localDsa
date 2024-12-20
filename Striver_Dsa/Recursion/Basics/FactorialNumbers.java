package Basics;
import java.util.ArrayList;
import java.util.List;

public class FactorialNumbers {
    public static List<Integer> factorialNumbers(int n) {
        List<Integer> result = new ArrayList<>();
        int factorial = 1;
        int i = 1;

        while (factorial <= n) {
            result.add(factorial);
            i++;
            factorial *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 6;
        System.out.println("Factorial numbers less than or equal to " + n1 + ": " + factorialNumbers(n1)); // Output: [1, 2]
        System.out.println("Factorial numbers less than or equal to " + n2 + ": " + factorialNumbers(n2)); // Output: [1, 2, 6]
    }



public void reverseArray(int arr[]) {
        // code here
        
         int start=0;
    int end=arr.length;
        
            reverseArrayFunction(arr,start,end);
        }
        
       public void reverseArrayFunction(int arr[],int start,int end){
        if(start<end){
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end]=temp;reverseArrayFunction(arr,start+1,end-1);
    }
}

}
