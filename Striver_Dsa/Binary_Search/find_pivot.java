import java.util.ArrayList;
import java.util.List;

public class find_pivot {
  
    
public static void main(String[] args) {
   List<Integer> arr = new  ArrayList<>();

   arr.add(39);
   arr.add(6);
   arr.add(11);
   arr.add(14);
   arr.add(18);
   arr.add(36);
   arr.add(37);
   arr.add(38);
 
   System.out.println(findKRotation(arr));

//    39 6 11 14 18 36 37 38
//    [5, 1, 2, 3, 4]
}
 public static int findKRotation(List<Integer> arr) {
        // Code here
        int start=0;
        int end=arr.size();
        // System.out.println(end);
        // return end;
        int min =Integer.MAX_VALUE;
        
        while(start<=end){
            
            int mid=start+(end-start)/2;
            
            if(arr.get(start)<=arr.get(mid)){
                min=Math.min(arr.get(start),min);
                start=mid+1;
            }
            else {
                min=Math.min(arr.get(mid),min);
                end=mid-1;
            }
        
            
        }
        return min;
    }
}
