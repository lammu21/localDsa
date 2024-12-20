package Linked_list.Singly_Lisked_list;

/**
 * GFG_insertion_IN_Linkedlist
 */

 class Node {
    int data;
    Node next;
   public  Node (int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
    public  Node (int data)
    {
        this.data=data;
        this.next=null;
    }
 }
public class GFG_insertion_IN_Linkedlist {
    // 9->0->5->1->6->1->2->0->5->0




    Node insertAtBeginning(Node head, int x)
    {
        // code here
        if(head.next.data)
        
        
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
    }









    public static void display_linked_list(Node head){
        Node current = head; 
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }
    }

    

    public static void main(String[] args) {
        
  
   Node head = new Node(9);
   Node second = new Node(0);
   Node third = new Node(5);
   Node fourth = new Node(1);
   Node fifth = new Node(6);
   Node sixth = new Node(1);
   Node seventh = new Node(2);
   Node eight = new Node(0);
   Node ninth = new Node(5);
   Node tenth = new Node(0);

   head.next=second;
   second.next=third;
   third.next=fourth;
   fourth.next=fifth;
   fifth.next=sixth;
   sixth.next=seventh;
   seventh.next=eight;
   eight.next=ninth;
   ninth.next=tenth;

   display_linked_list(head);

}
    
}