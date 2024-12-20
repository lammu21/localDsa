package Sorting_methods.Cyclic_Sort;

public class Missing_number {

    public static void main(String[] args) {
        int []nums = {0,1};
        System.out.println(missingNumber(nums));
    }
    

    public static int missingNumber(int[] nums) {
        int i=0;
        // int len = nums.length;

        while(i<nums.length){
            int correct_index= nums[i];
         
             if(correct_index<nums.length&&i<nums.length&&nums[i]!=nums[correct_index]){
                swap(nums,i,correct_index);
            
           
            }
            else {
                i++;

        }
    }
        // System.out.println(nums.toString());
       for(int j=0;j<nums.length;j++){
           if(nums[j]!=j){
               return j;
           }
          
       }
        return nums.length;

    }

   static void swap (int [] nums,int index, int correct_index){
        int temp =nums[index];
        nums[index]=nums[correct_index];
        nums[correct_index]=temp;
    }
}
