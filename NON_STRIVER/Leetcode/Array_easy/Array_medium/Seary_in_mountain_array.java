package Leetcode.Array_easy.Array_medium;

public class Seary_in_mountain_array {

    public static void main(String[] args) {
        int [] nums ={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {

        int pivot=binarysearch(nums,0,nums.length-1);        


    }
    private static int binarysearch(int[] nums, int i, int j) {
        int start=i;
        int end=j;
        int mid=0;
        while (start<=end) {
            mid= start+(end-start)/2;




                
        }
    }
}
