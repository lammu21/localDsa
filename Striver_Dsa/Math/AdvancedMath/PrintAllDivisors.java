package Math.AdvancedMath;

import java.util.ArrayList;

/**
 * PrintAllDivisors
 */
public class PrintAllDivisors {
    public static void main(String[] args) {
     

        print_divisors(20);
    }

    
    
      public static void print_divisors(int n) 
      {
        // code here
        // My Approach 
        // for(int i =1;i<=n;i++){
        //     if(n%i==0){
        //         System.out.print(i+" ");
        //     }
        // }
        
        // Optimal Approach
        // ArrayList <Integer> list = new ArrayList<>();
        // for(int i=1;i*i<=n;i++){
        //     if(n%i==0){
        //         System.out.print(i+" ");
        //         if(n/i!=i){
        //             list.add(n/i);
        //         }
        //     }
           
            
        // }
        // for(int j=list.size()-1;j>=0;j--){
        //     System.out.print(list.get(j)+" ");
        // }
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n% i == 0) {
                System.out.print(i + " ");

                // Check if i is a perfect square of N
                if (i != (n / i)) {
                    System.out.print(n / i + " ");
                }
            }
        }
        
        
    }
}