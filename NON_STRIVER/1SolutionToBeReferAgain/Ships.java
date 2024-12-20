package SolutionToBeReferAgain;

public class Ships {
    public static void main(String[] args) {
      int [] weights = {1,2,3,4,5,6,7,8,9,10};
      int days =1;
    //   System.out.println(findmax(weights));
    // System.out.println(findSummation(weights));
    // System.out.println(find_days_per_capacity(55, weights));
    System.out.println(shipWithinDays(weights, days));
    }

    public static int shipWithinDays(int[] weights, int days) {
        
        int max =findmax(weights);
        int summation = findSummation(weights);
        int low =max;
        int high=summation;
        int mid=0;
        while (low<=high) {
            mid=low+(high-low)/2;
            int days_per_capacity=find_days_per_capacity(mid, weights);
            if (days_per_capacity<=days) {
              high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
        
    }

    private static int find_days_per_capacity(int capacity, int[] weights) {


        int load =0;


        int day=1;
        for (int j = 0; j < weights.length; j++) {
            if (load+weights[j]>capacity) {
                day=day+1;
                load=weights[j];

        }
        else{
            load=load+weights[j];
        }
       
            
        }
        return day;
    }

    private static int findSummation(int[] weights) {
         int summation =0;
         for (int i = 0; i < weights.length; i++) {
            summation=summation+weights[i];
         }
         return summation;
    }

    public static int findmax(int[] weights) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < weights.length; i++) {
            if(weights[i]>max){
                max=weights[i];
            }
        }
      
        return max;
      
    }
}
