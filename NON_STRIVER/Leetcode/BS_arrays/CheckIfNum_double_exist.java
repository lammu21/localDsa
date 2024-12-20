package BS_arrays;

public class CheckIfNum_double_exist {

    public static void main(String[] args) {
        int [] arr = {-2,0,10,-19,4,6,-8};

        System.out.println(checkIfExist(arr));
    }
    
    public static boolean checkIfExist(int[] arr) {
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==2*arr[i])
                {
                   return true;
                }
            }

        }
      return false;
    }
}
