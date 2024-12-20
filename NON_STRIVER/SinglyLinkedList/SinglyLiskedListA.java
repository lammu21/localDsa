package SinglyLinkedList;

import org.w3c.dom.Node;

public class SinglyLiskedListA
{
    private ListNode head;

   private static class ListNode{
       private int data ;
       private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = next;
        }
    }
   public boolean detectLoopList()
  {
    ListNode fastPointer=head;
    ListNode slowPointer=head;
    while (fastPointer!=null&&fastPointer.next!=null) 
    {
        slowPointer=slowPointer.next;
        fastPointer=fastPointer.next.next;
        if(slowPointer==fastPointer)
        {
            return true;
        }

        }
    return false;
    }


    public ListNode firstNodeOfLoop()
    {
       ListNode fastPointer =head;
       ListNode slowPointer=head;
       while (fastPointer!=null&&fastPointer!=null) 
       {
        fastPointer=fastPointer.next.next;
        slowPointer=slowPointer.next;
        if(slowPointer==fastPointer)
        {
            return removeLoopFromList(slowPointer);
        }
        
       }        
        return null;
        
    }
     
    public ListNode firstNodeDeTectOr(ListNode slowPointer ){
       
       ListNode temp=head;
       while(temp!=null&&slowPointer!=null)
       {
        if (temp!=slowPointer) {
            temp=temp.next;
            slowPointer=slowPointer.next;
        }
        else{
            return slowPointer;
        }
        
    }
         return null;    
    }



    public ListNode removeLoopFromList(ListNode slowPointer)
    {
       ListNode temp=head;
       while(temp!=null&&slowPointer!=null)
       {
        if (temp.next==slowPointer.next) {
            slowPointer.next=null;
            return null;
        }
         temp=temp.next;
         slowPointer=slowPointer.next;
        
      }
    return slowPointer;
        
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
    
   public static void main(String[] args) {
    SinglyLiskedListA singlyLiskedListAObject = new SinglyLiskedListA();
    singlyLiskedListAObject.head=new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(4);
    ListNode fifth = new ListNode(5);
    ListNode sixth= new ListNode(6);

    singlyLiskedListAObject.head.next=second;
    second.next=third;
    third.next=fourth;
    fourth.next=fifth;
    fifth.next=sixth;
    sixth.next=second;
    // singlyLiskedListAObject.display();
    // System.out.println(singlyLiskedListAObject.detectLoopList());
    // ListNode FirstNodeOfLoop=singlyLiskedListAObject.firstNodeOfLoop();
    // if(FirstNodeOfLoop!=null){
    // System.out.println(FirstNodeOfLoop.data);
    // }
    // else{
    //     System.out.println("Null");
    // }

    // System.out.println(singlyLiskedListAObject.firstNodeOfLoop());

    ListNode removeLoopFirstNode=singlyLiskedListAObject.firstNodeOfLoop();
    if(removeLoopFirstNode!=null){
    System.out.println(removeLoopFirstNode.data);
    }
    else{
        System.out.println("Null");
    }
    singlyLiskedListAObject.display();
  }

}



