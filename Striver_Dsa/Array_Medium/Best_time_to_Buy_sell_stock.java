package Striver_Dsa.Array_Medium;

public class Best_time_to_Buy_sell_stock {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
    //    
    //    int min_index=0;
        //   int len= prices.length;
        // int max=prices[len-1];
    //    int max_index=len-1;
    //    for (int j = len-1; j >=0; j--) {
    //        if (prices[j]>max) {
    //            max=prices[j];
    //            max_index=j;
    //        }
    //     }
    //        int min=prices[max_index];

    //        for (int i = max_index; i >= 0; i--) {
    //         if (prices[i]<min) {
    //             min=prices[i];
    //         }
    //        }

     // for (int i = 0; i < prices.length; i++) {
        //     // min_index=i;
        //      if(prices[i]<min){
        //      min=prices[i];
        //      min_index=i;
        //      }
        
        // int profit=max-min;
        // return profit;

        int max=0;
        int min_price=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min_price=Math.min(min_price, prices[i]);
            max=Math.max(max, prices[i]-min_price);
        }
         return max;
            }
           
       
       
       
      
        }
        
        
    

