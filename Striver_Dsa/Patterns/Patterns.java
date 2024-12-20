package Striver_Dsa.Patterns;

public class Patterns {
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(6);
        // pattern4(5);
        pattern7(6);
        
    }


// * * *
// * * *
// * * *
    public static void pattern1(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }


// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * * * 
// * * * * * * * 
// * * * * * * * * 
// * * * * * * * * * 

    public static void pattern2(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }

// 1
// 1 2 
// 1 2 3


public static void pattern3(int n) {
    // Write your code here
    for (int i = 0; i <n; i++) {
        for (int j = 0; j <=i; j++) {
            System.out.print(j+1 +" ");
            
        }
        System.out.println();
        
    }
}

// 1
// 2 2 
// 3 3 3
public static void pattern4(int n) {
    // Write your code here
    for (int i = 0; i <n; i++) {
        for (int j = 0; j <=i; j++) {
            System.out.print(i+1 +" ");
            
        }
        System.out.println();
        
    }
}

// * * *
// * *
// *

public static void pattern5(int n) {
       
    for (int i = n; i>0; i--) {
       for (int j = i; j > 0; j--) {
           System.out.print("* ");
           
       }
        System.out.println();
        
    }
}
    
// *       
// ***
// *****
// *******
// *********
// ***********
public static void pattern7(int n) {

    // Space
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <n-i+1; j++) {
            System.out.print(" ");
            
        }
    //    Star
        for (int j = 0; j < 2*i+1; j++) {
            System.out.print("*");
            
        }
    // Space
        for (int j = 0; j <n-i+1; j++) {
            System.out.print(" ");
            
        }
        System.out.println();
        
    }
}

// *
// ***
// *****

public static void pattern7A(int n){



    for (int i = 1; i <= n; i++) {
        // Print spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        // Print stars
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}






public static void pattern8(int n) {

    // Space
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <n-i+1; j++) {
            System.out.print(" ");
            
        }
    //    Star
        for (int j = 0; j < 2*i+1; j++) {
            System.out.print("*");
            
        }
    // Space
        for (int j = 0; j <n-i+1; j++) {
            System.out.print(" ");
            
        }
        System.out.println();
        
    }
}
































































}


