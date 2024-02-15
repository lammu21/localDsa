package BinarySearch.ArraysBS;

public class ceiling_of_a_number {
    
public static int ceiling_of_a_number(int [] num_array,int search_number)
{
    int start = 0;
    int end = num_array.length-1;
    int mid = 0;

    while (start<end)
    {
        mid = start+(end-start)/2;
        if (num_array[mid]<search_number) 
        {
            start= mid+1;
        }
        else if (num_array[mid]>search_number)
        {
            end= mid-1;
        }
        else {
            return num_array[mid+1];
        }
       
    }

    return 0;

}


public static int floor_of_a_number(int [] num_array,int search_number)
{
    int start = 0;
    int end = num_array.length-1;
    int mid = 0;

    while (start<end)
    {
        mid = start+(end-start)/2;
        if (num_array[mid]<search_number) 
        {
            start= mid+1;
        }
        else if (num_array[mid]>search_number)
        {
            end= mid-1;
        }
        else {
            return num_array[mid-1];
        }
       
    }

    return 0;

}

    public static void main(String[] args) {
        int [] num_array= {1,2,3,4,5,6,7,8,9,10};
        int search_number=2;
        int res =floor_of_a_number(num_array, search_number);
        System.out.println(res);
    }
}
