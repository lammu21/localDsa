package Array_easy;

public class K_missing_number {
    
public static void main(String[] args) {
    int [] arr={1,2};
    int k =1;
    System.out.println(findKthPositive(arr, k));

}

        // public static int findKthPositive(int[] arr, int k) {
        //     int start = 0;
        //     int end = arr.length-1;
        //     int mid = 0;
    
        //     while (start <= end) {
        //         mid = start+(end-start)/2;
        //         int missing_numbers_at_index=arr[mid]-(mid+1);
        //         if(missing_numbers_at_index<k)
        //         {
        //             start=mid+1;
        //         }
        //         if(missing_numbers_at_index>k)
        //         {
        //             end=mid-1;
        //         }

        //         else if (missing_numbers_at_index==k)
        //         {
        //             return missing_numbers_at_index;
        //         }
    
        //     }
        //     return start+k;
        // }


        public static int findKthPositive(int[] arr, int k) {
            int left = 0, right = arr.length - 1;
        
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int missingNumbers = arr[mid] - mid - 1;
                
                if (missingNumbers < k) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            return left + k;
        }
    }

