package Striver_Dsa.Array_Medium;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element169 {
    public static void main(String[] args) {
        int []nums ={6,5,5};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
// // Brute Force 
// for (int i = 0; i < nums.length; i++) {
//     int count =0;
//     for (int j = 0; j < nums.length; j++) {
//         if (nums[i]==nums[j]) {
//             count++;
            
//         }

//     }
//     if(count>(nums.length/2)){
//         return nums[i];
//     }
// }
// return -1;
//     }
        
        
        
// hashing method 
//           int n = nums.length;

//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
             
//                 int value = map.getOrDefault(nums[i], 0);
//                 map.put(nums[i],value+1);
            
//             }

// for (Map.Entry<Integer, Integer> it : map.entrySet()) {
//     if (it.getValue() > (n / 2)) {
//         return it.getKey();
//     }
// }

// return -1;
// }

// Morre's Voting algothirm
    int majority=nums[0];
    int votes=1;
    for (int i = 1; i < nums.length; i++) {
        if(votes==0){
            majority=nums[i];
            votes++;
        }
        else if (majority==nums[i]) {
            votes++;
        }
        else {
            votes--;
        }
    }
    return majority;


    }
}

