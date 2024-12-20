package Basics;
public class Sumoffirstnterms {

    public static void main(String[] args) {
        sumOfSeries(256);
    }
    static long sumOfSeries(long n) {
        // code here
        long new_n=0;
        long count=0;
        while(n>0){
             new_n=n/10;
            count++;
        }
        return sum_function(count,n);
        
    }
    static long sum_function(long count,long n){
             if(count>0){
                 return n;
             }
            return (long)sum_function(count-1,n)*n;
     }
}