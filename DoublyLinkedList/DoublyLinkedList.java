package DoublyLinkedList;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;


    class ListNode
    {
        int data;
        ListNode next;
        ListNode previous;

        public ListNode(int data) 
        {
            this.data = data;
        }
        
        
    }
   

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty()
    {
        return length==0;
    }

    public int length()
    {
        return length;
    }

    public void  insertFirst(int value)
    {
        ListNode newNode = new ListNode(value);
        if(head==null)
        {
            tail=newNode;
        }
        else{
           head.previous=newNode;
        }

        newNode.next=head;
        head=newNode;
        length++;
    }

     public void  insertLast(int value)
    {
        ListNode newNode = new ListNode(value);
        if(head==null)
        {
            tail=newNode;
        }
        else{
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

     public void displayBackward()
    {
        ListNode current= tail;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.previous;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(1);
        doublyLinkedList.insertFirst(10);
        doublyLinkedList.insertFirst(20);
        doublyLinkedList.insertFirst(30);
         doublyLinkedList.insertLast(50);

        doublyLinkedList.display();
        System.out.println("---------------------");
        doublyLinkedList.displayBackward();
        

    }


    
}
