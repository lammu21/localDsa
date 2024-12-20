package Linked_list.Singly_LL_MEDIUM_PROBLEMS;

import NON_STRIVER.stack.Node;

 class ListNode {
       int val;
         ListNode next;
         ListNode() {}
         ListNode(int val)  {
   
           this.val = val; }
         ListNode(int val, ListNode next) {
           this.val = val; this.next = next; 
          }

}

public class Middle_of_the_Linked_List876 {
    public static void main(String[] args) {
      ListNode head= new ListNode(1);
        // head.next=second;
        ListNode second = new ListNode(2);

   
        ListNode third=new ListNode(3);

        ListNode second = new ListNode(2);
        ListNode fourth = new ListNode(4);

        ListNode fifth= new LisNode(5);


        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

    }
}
