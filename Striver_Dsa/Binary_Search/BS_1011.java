/**
 * BS_1011
 */
public class BS_1011 {

    public static void main(String[] args) {
      int []  weights = {1,2,3,4,5,6,7,8,9,10};
      int days = 5;
      System.out.println(shipWithinDays(weights, days));
    }


    public static int shipWithinDays(int[] weights, int days) {
        // why we take max of array start , i.e.,we want make sure that we can carry any
        // weight in within a day, if we take of max of array, we can carry all other
        // weights in within a day
        int start = Integer.MIN_VALUE;
        // why we take summation of array as end i.e., summation is enough to carry ship
        // all in a day, more summation can also do to optimize the we take summation
        int end = 0;
        for (int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]);
            end += weights[i];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int daysReqToMid = calculateDaysReqToMid(weights, mid);
            if (daysReqToMid <= days) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
    public static int calculateDaysReqToMid(int[] weights, int capacity){
        //  day one 
        int days=1;

        int load=0;
          for (int i = 0; i < weights.length; i++) {
            if(load+weights[i]>capacity){
                days++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
          }
          return days;
    }
}