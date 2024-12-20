package Array_Medium;

public class Single_element_Sorted {
    public static void main(String[] args) {
        int [] arr= {1,1,2};
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                i = i + 2;
                j = j + 2;
            }
            else {
                return nums[i];
            }
            
        }
        return nums[i];
    }
}
