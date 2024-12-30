package Striver_Dsa.Recursion_Problems;

import java.util.Arrays;

public class Print1_n {
    public static void main(String[] args) {
        int[] res=printNos(5);
        // System.out.println(Arrays.toString(res));
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int [] res = new int[x];
        int i =0;
        recursionFunct(x,res,i);
        // System.out.println(res);
        System.out.println(Arrays.toString(res));
        return res;
    }
    public static void recursionFunct(int x, int[]res, int i)
    {
        if(x>0||i>res.length-1){
            return;
        }
        res[i]=x;
        recursionFunct(x-1, res, i+1);
    }
}

