package Striver_Dsa.Arrays_easy;

public class CheckSorted_array {
    public static void main(String[] args) {
        int arr[] ={0,0,0,1};
        System.out.println(isSorted(4, arr));
    }
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for (int i = 1; i < a.length; i++) {
            if(a[i]>=a[i-1])
            {

            }
            else{
                return 0;
            }
        }
        return 1;
    }
}
