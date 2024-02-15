package Leetcode.Array_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find_Words_Containing_Character2942
 */
public class Find_Words_Containing_Character2942 {

     
    public static List<Integer> findWordsContaining(String[] words, char x) {
       

        List<Integer> indexs = new ArrayList<>(100);
        for (int i = 0; i < words.length; i++) {
           
           if(words[i].contains(String.valueOf(x)))
           {
             indexs.add(i);
           }

           System.gc();
           
        }
        return indexs;
    }


//     public static int maximumWealth(int[][] accounts)
//    {

//     int max=0;
//      int [] money = new int[100];
//      int [] money1 = new int[100];
       
//      for (int i = 0; i < 1; i++) {
        
//         for (int j = 0; j < accounts[i].length; j++) {

//             money[i]=accounts[i][j];
//             System.out.println(money[i]);
//         }
//     }

//         for (int i = 1; i < 2; i++) {
        
//             for (int j = 0; j < accounts[i].length; j++) {
    
//                 money1[i]=accounts[i][j];
//                 System.out.println(money1[i]);
//             }
       

       
//      }
//     return max;
//     }

    public static void main(String[] args) {
        String [] words = {"leet","code"};
        char x = 'e';

        int [][] accounts = {{1,2,3},{3,2,1}};

        // maximumWealth(accounts);z
       
    //    System.out.println(findWordsContaining(words,x));
    }

}