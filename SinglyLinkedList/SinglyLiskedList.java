package SinglyLinkedList;

public class SinglyLiskedList {

    private Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
           
        }

    }

    public void removeDeplicateDataFromSortedList(){
        Node current =head;
        while (current!=null&&current.next!=null) 
        {
            if (current.data==current.next.data) {
                current.next=current.next.next;
            }
            current=current.next;
        } 

        
    }

    public void insertNodeInASortedList(int value)

    {
        Node NewNode= new Node(value);
       if(head.data==0)
        {
            head.data=value;
        }
        if(head.data>value)
        {
            NewNode.next=head;
            head=NewNode;
        }
        Node current=head;
        Node temp=null;
        while (current!=null&&current.data<value)
        {
            // temp=current.next;
            // current.next=NewNode;
            // NewNode.next=temp;
              temp=current;
              current=current.next;
            
        }
         NewNode.next=current;
         temp.next=NewNode;

    }

    public void removeKeyFromLiskList(int key)
    {
        if (head.data==key)
        {
            head=head.next;
            return;
        }
        else
        {
           Node current = head;
           Node temp=null;
           while (current!=null&&current.data!=key) 
           {
            temp=current;
            current=current.next;
           }
           if (current==null)
           {
            System.out.println("Key Not Found");
            return;
           }
           temp.next=current.next;
        }
    }

    public void display()
    {
      Node current = head;
      while(current!=null)
      {
        System.out.print(current.data +"-->");
        current=current.next;
      }
      System.out.println();
    }

    public static void main(String[] args) {
        SinglyLiskedList singlyLinkedList1 = new SinglyLiskedList();
        
        singlyLinkedList1.head= new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        singlyLinkedList1.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;



        singlyLinkedList1.display();
        // singlyLinkedList1.removeDeplicateDataFromSortedList();
        // System.out.println("___");
        // singlyLinkedList1.display();

        // singlyLinkedList1.insertNodeInASortedList(7);
        // singlyLinkedList1.display();
        singlyLinkedList1.removeKeyFromLiskList(7);
        singlyLinkedList1.display();
        

    }

}
