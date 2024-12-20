package Arrays_easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RightRotate {

    public static void main(String[] args) {
        // int [] nums={1,2,3,4,5,6};
        // int k =3;
        // rotate(nums,k);
        // System.out.println(Arrays.toString(nums));

        // int [] a={1, 2, 3, 4, 6};
        // int [] b={2, 3, 5};
    
        // List <Integer> result=sortedArray(a, b);
        // int i =0;
        // while (i<result.size()) {
        //     System.out.println(result.get(i));
        //  }

    }
    public static void rotate(int[] nums, int k) {
        ArrayList <Integer>list = new ArrayList<>();
        int len=nums.length;
        k=k%len;

        for (int i = len-k; i < len; i++) {
            list.add(nums[i]);
            
        }

        for (int i = 0; i <len-k; i++) {
            list.add(nums[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i]=list.get(i);
        }

       
    }

     public static List< Integer > sortedArray(int []a, int []b) {
            
            // Write your code here
           List <Integer> result = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
       for (Integer integer : a) {
        hashSet.add(integer);
        
       }
       for (Integer integer : b) {
        hashSet.add(integer);
       }
    
       for (Integer integer : hashSet) {
        result.add(integer);
       }
             
    
        
           
           return result;
        }
}
