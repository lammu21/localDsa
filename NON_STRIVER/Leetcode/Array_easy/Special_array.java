package Array_easy;

public class Special_array {


    public static void main(String[] args) {
        int arr[]={0,4,3,0,4};

        System.out.println(specialArray(arr));

    }
    // 
    
        public static int specialArray(int[] nums) {
            //Optional: sorting:
            //Arrays.sort(nums);
            //The least value can be 0 as the numbers are all 0 
            int start=0;
            //The maximum value can be the length as all numbers are greater than the 
            //Length of the array and the value is inclusive
            int end=nums.length;
            while(start<=end)
            {
                int mid =start+(end-start)/2;
                int count = count(nums,mid);
                if (count==mid) {
                     return mid;
                }

                if (count<mid) {
                    end=mid-1;
                }

                else if (count>mid) {
                    start=mid+1;
                }
            }
            return -1;
              
            
        }
        public static int count(int[]arr,int t)
        {
            int c=0;
            for(int i:arr)
            {
                if(i>=t)
                {
                    c++;
                }
            }
            return c;
        }
    }



