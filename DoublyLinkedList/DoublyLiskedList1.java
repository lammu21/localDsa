package DoublyLinkedList;

import java.util.NoSuchElementException;

/**
 * DoublyLiskedList1
 */
public class DoublyLiskedList1 {

    ListNode head;
    ListNode tail;
    int length;

    class ListNode{
        int data;
        ListNode next;
        ListNode previous;
        public ListNode(int data) {
            this.data = data;
        }

    }

    public DoublyLiskedList1()
    {
        head =null;
        tail=null;
        length=0;

    }

    public boolean isEmpty()
{
    return length==0;

}

public int length()
{
    return length;
}

    public void insertNodeAtlast(int value)
    {
       ListNode newNode=new ListNode(value);
       if(isEmpty())
       {
        head =newNode;
       }
       else
       {
        tail.next=newNode;
        
       }
        newNode.previous=tail;
        tail=newNode;
        length++;
    }

    
    public void display()
    {
        ListNode current= head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
    }

    public ListNode deleteFirstNode()
    {
        ListNode temp=head;
        if (isEmpty()) {
            throw new NoSuchElementException();
            
        }
        else{
            head.next.previous=null;
            head=head.next;
            temp.next=null;
        }
        return temp;
    }

    public ListNode deleteLastNode()
    {
        ListNode temp=tail;
        if (isEmpty()) {

            throw new NoSuchElementException();
        }
        else{
            tail.previous.next=null;
            tail=tail.previous;
            temp.previous=null;

        }
        return temp;
    }

    public static void main(String[] args) {
        DoublyLiskedList1 doublyLiskedList1= new DoublyLiskedList1();
        doublyLiskedList1.insertNodeAtlast(1);
         doublyLiskedList1.insertNodeAtlast(2);
          doublyLiskedList1.insertNodeAtlast(3);
          doublyLiskedList1.display();
          System.out.println();
          ListNode deletedNode=doublyLiskedList1.deleteLastNode();
          System.out.println(deletedNode.data);
          doublyLiskedList1.display();
        }
}