package Linked_list.Singly_LL_MEDIUM_PROBLEMS;

import java.util.ArrayList;

/**
 * Even_Odd_328
 */


 public class Even_Odd_328 {

   

  public ListNode oddEvenList(ListNode head) {
         ArrayList<Integer> arr = new ArrayList<>();
         ListNode current=head;
         while(current!=null&&current.next!=null){
          arr.add(current.val);
          current=current.next.next;
         }
         if(current.val!=0){
          arr.add(current.val);
         }
         current=head.next;
         while(current!=null&&current.next.next!=null){
          arr.add(current.val);
          current=current.next.next;
         }
         if(current.val!=0){
          arr.add(current.val);
         }
        current=head.next;
        int i=0;
         while(current!=null){
          current.val=arr.get(i);
          i++;
          current=current.next;
         }
         return head;

      
  }
}

 public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



    
