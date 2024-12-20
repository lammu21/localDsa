package BS_arrays;

/**
 * Two_Sum_167
 */
public class Two_Sum_167 {

    public int[] twoSum(int[] numbers, int target) {
        int start =0;
        int end=numbers.length-1;
        int mid=0;
        int [] result = new int [2];
        while (start<=end)
        {
            mid = start+(end-start)/2;

            if(numbers[mid]+numbers[mid-1]==target)
            {
                result[0]=numbers[mid-1];
                result[1]=numbers[mid];

            }
           else if (numbers[mid]+numbers[mid+1]==target) {
                result[0]=numbers[mid];
                result[1]=numbers[mid+1];
            }

            else if (numbers[mid]+numbers[mid-1]<target)
            {
                start
            }

        }

      
      
      
        return numbers;
        
    }



    public static void main(String[] args) {
        int [] num_Array={2,7,11,15};
        int target_sum=9;
    }
}