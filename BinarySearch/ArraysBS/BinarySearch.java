package BinarySearch.ArraysBS;

public class BinarySearch {
    
   public static int binarySearchMethod(int [] numbers_array, int seaching_Number)
   {
     int start =0;
     int end = numbers_array.length-1;
    

     while (start<end)
    {
        int mid = start+(end-start)/2;
        if (numbers_array[mid]<seaching_Number) 
        {
            start= mid+1;
        }
        else if (numbers_array[mid]>seaching_Number)
        {
            end=mid-1;
        }
        else
        {
            return mid;
        }
        
     }
     


    return -1;
   }

    public static int game(int n, int seaching_Number)
   {
     int start =0;
     int end = n;
     int mid=0;

     while (start<=end)
    {
         mid = start+(end-start)/2;
        if (mid<seaching_Number) 
        {
            start= mid+1;
        }
        else if (mid>seaching_Number)
        {
            end=mid-1;
        }
        else
        {
            return mid;
        }
        
     }
     


    return mid;
   }






   




    public static void main(String[] args) {
        // int [] numbers_array={-1,0,3,5,9,12};
        int seaching_Number=4;
        int n=5;
        //  System.out.println(binarySearchMethod(numbers_array, seaching_Number));
        int output_of_method=game(n, seaching_Number);
        System.out.println(output_of_method);
    }
}
