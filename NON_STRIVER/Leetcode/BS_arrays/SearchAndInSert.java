package BS_arrays;

import java.util.ArrayList;

/**
 * SearchAndInSert
 */
public class SearchAndInSert {

    public static void main(String[] args) {
        int [] number_array={1,3,5,6};
        int target =2;

    }

    public static int searchAndInSert_method(int []number_array,int target)
    {
        int start =0;
        int end =number_array.length-1;
        int mid =0;

        ArrayList<Integer> indexes_array= new ArrayList();

        while (start<=end) {
            
            mid=start+(end-start)/2;

            if (number_array[mid]<target) {
                
               start=mid-1;
               if (indexes_array.get(mid)!=mid+1) {
                 indexes_array.add(mid);
               }
            }
            if (number_array[mid]>target) 
            {
                end=mid+1;
                if (indexes_array.get(mid)!=mid+1) {
                    indexes_array.add(mid);
                  }
                
            }
            else if (number_array[mid]==target)
            {
                return mid;
            }
            else{

            }
            
        }
        
        
        return ;
        
    }

     public static int Find_index(ArrayList<Integer> indexes_array,int target)
     {
       for (Integer integer : indexes_array) {
           int index= indexes_array.get(integer);
           if (index==target+1) {
            return index;
           }
       }
        
     }
    
}