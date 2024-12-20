package SinglyLinkedList;

/**
 * BsinglyLiskedList
 */
public class BsinglyLiskedList 
{

    private ListNode head;

    /**
     * ListNode
     * 
     */
    private static class ListNode
    {
        private int data;
        private ListNode next;
        
        public ListNode(int data)
        {
            this.data = data;
            this.next=next;
        }

    }
    
    
        



    public static ListNode addtwoListNodes(ListNode a,ListNode b)
    {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;

        while (a!=null && b!=null)
        {
            if(a.data<=b.data)
            {
                temp.next=a;
                a=a.next;
            }


            else
            {
                temp.next=b;
                b=b.next;

            }
            temp=temp.next;


            if(a==null)
            {
                temp.next=b;
            }

            else if (b==null)
            {
                temp.next=a;

            }
        }
        return dummy.next;
    }



    public static ListNode addNodeOfTwoDifferentLiskedlist(ListNode a, ListNode b)
    {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry =0;

        while (a!=null &&b!=null)
        {
            int x=(a!=null)?a.data:0;
            int y=(b!=null)?b.data:0;
            int sum = x+y+carry;
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            if(a!=null){
                a=a.next;
            }
            if(b!=null)
            {
                b=b.next;

            }


        }
        if(carry>0)
        {
           temp.next=new ListNode(carry);
        }
        
        return dummy.next;

    }

    
    public void display()
    {
     ListNode current = head;
     while(current!=null)
     {
       System.out.print(current.data +"-->");
       current=current.next;
     }
     System.out.println();
   }

    public static void main(String[] args) 
    {
        BsinglyLiskedList bsll=new BsinglyLiskedList();
        bsll.head=new ListNode(1);
        ListNode second =new ListNode(3);
        ListNode third =new ListNode(5);
        ListNode fourth =new ListNode(7);
        ListNode fifth =new ListNode(9);
        
        bsll.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;


        BsinglyLiskedList bsll2=new BsinglyLiskedList();
        bsll2.head=new ListNode(2);
        ListNode second2 =new ListNode(4);
        ListNode third2 =new ListNode(6);
        ListNode fourth2 =new ListNode(8);
        ListNode fifth2 =new ListNode(10);
        
        bsll2.head.next=second2;
        second2.next=third2;
        third2.next=fourth2;
        fourth2.next=fifth2;

        bsll.display();
        bsll2.display();
        BsinglyLiskedList result= new BsinglyLiskedList();
        result.head =addNodeOfTwoDifferentLiskedlist(bsll.head,bsll2.head);
        result.display();



    }




}