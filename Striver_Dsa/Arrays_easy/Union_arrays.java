package Arrays_easy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union_arrays {
    public static void main(String[] args) {
        int [] a={1,2,3,4,6};
        int [] b={2,3,5};
    
        List <Integer> result=sortedArray(a, b);
        int i =0;
        while (i<result.size()) {
            System.out.println(result.get(i));
            i++;
         }
           
      }
        
      public static List< Integer > sortedArray(int []a, int []b) {
         List<Integer> result= new ArrayList<>();
         int n= a.length;
         int m=b.length;
         int i=0;
         int j=0;
         while (i<n&&j<m) {
            if(a[i]<b[j]){
               i++;
            }
            else if (a[i]>b[j]) {
               j++;
               
            }
            else {
               result.add(a[i]);
               i++;
               j++;

            }

            
         }
         // while (i>n&&j<m) {
         //    result.add(i);
            
         // }
         // while (i<n&&j>m) {
         //    result.add(j);
            
         // }
        return result;

      }

         // public static List< Integer > sortedArray(int []a, int []b) {
            
      //       // Write your code here
      //      List <Integer> result = new ArrayList<>();
      //   Set<Integer> hashSet = new HashSet<>();
      //  for (Integer integer : a) {
      //   hashSet.add(integer);
        
      //  }
      //  for (Integer integer : b) {
      //   hashSet.add(integer);
      //  }
    
      //  for (Integer integer : hashSet) {
      //   result.add(integer);
      //  }
             
    
        
           
      //      return result;
      //   }
    }
    

