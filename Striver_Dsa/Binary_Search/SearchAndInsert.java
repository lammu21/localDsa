package Binary_Search;

/**
 * SearchAndInsert
 */
public class SearchAndInsert {
public static void main(String[] args) {
    int [] nums = {1,3,5,6};
    int target = 2;

    System.out.println(searchInsert(nums,target));
}

public static int searchInsert(int[] nums, int target) {
    int len=nums.length;
   int start=0;
   int end=len-1;
   int result=-1;
   while(start<=end){
       int mid=start+(end-start)/2;
       // System.out.println("---"+mid+"--");
       if(nums[mid]==target){
           // result=mid;
           //  start=mid+1;
           return mid;
          
       }
       else if (nums[mid]<target){
            result=mid;
            start=mid+1;
           // start=mid
       }
       else{
           end=mid-1;
       }
       
   }
    return result+1;

}
}
    
