import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
       int [] nums1 = {4,1,2}, nums2 = {1,3,4,2};
       int [] res=nextGreaterElement(nums1, nums2);

       for (int i : res) {
        System.out.println(i);
       }

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
      if (nums2.length == 0 || nums1.length == 0)
      return new int[0];

    Map<Integer, Integer> numberNGE = new HashMap<>();
    Stack<Integer> numStack = new Stack<>();

    numStack.push(nums2[nums2.length - 1]);
    numberNGE.put(nums2[nums2.length - 1], -1);

    for (int i = nums2.length - 2; i >= 0; i--) {

      if (nums2[i] < numStack.peek())
       {
        numberNGE.put(nums2[i], numStack.peek());
        numStack.push(nums2[i]);
        continue;
      }

      while (!numStack.isEmpty() && numStack.peek() < nums2[i])
        numStack.pop();

      if (numStack.isEmpty()) {
        numStack.push(nums2[i]);
        numberNGE.put(nums2[i], -1);
      } else {
        numberNGE.put(nums2[i], numStack.peek());
        numStack.push(nums2[i]);
      }
    }

    for (int i = 0; i < nums1.length; i++)
      nums1[i] = numberNGE.get(nums1[i]);

    return nums1;
  }

    }






















    
        // int[] ans = new int[nums1.length];
        // boolean found = false;
        // int pos=0;
        // int pos1=0;
        // for (int i = 0; i < nums1.length; i++) {
        //     for (int j = 0; j < nums2.length; j++) {

        //         if (nums2[j] == nums1[i]) {
        //             pos=j;
        //             found = true;
        //             break;
        //         }
        //     }

        //     if (found) {
        //         for (int k = pos + 1; k < nums2.length; k++) {
        //             if (nums2[k] > nums1[i]) {
        //                 pos1=k;
        //                 ans[i] = nums2[k];
        //                 break;
        //             }
        //             else{
        //                 ans[i] = -1;
        //             }
        //         }
        //     }
        //     // if (found==true && pos1==nums2.length) {
               
        //     // }

       

        // }
        // return ans;
            // int[] result = new int[nums1.length];
            // Stack<Integer> stack = new Stack<>();
            // int[] nextGreater = new int[nums2.length];
            
            // // Initialize nextGreater array to -1
            // for (int i = 0; i < nextGreater.length; i++) {
            //     nextGreater[i] = -1;
            // }
    
            // // Populate the nextGreater array with the next greater elements for nums2
            // for (int i = nums2.length - 1; i >= 0; i--) {
            //     while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
            //         stack.pop();
            //     }
            //     if (!stack.isEmpty()) {
            //         nextGreater[i] = stack.peek();
            //     }
            //     stack.push(nums2[i]);
            // }
    
            // // Fill the result array based on nums1
            // for (int i = 0; i < nums1.length; i++) {
            //     for (int j = 0; j < nums2.length; j++) {
            //         if (nums1[i] == nums2[j]) {
            //             result[i] = nextGreater[j];
            //             break;
            //         }
            //     }
            // }
    
            // return result;
      

    // }

