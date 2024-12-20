package Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import stack.StackUsingLiskedList.ListNode;

public class QueueImple 
{
    private ListNode front;
    private ListNode rear;
    private int length;
    

    public QueueImple() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public class ListNode
    {
     public int data;
     public ListNode next;

       public ListNode(int data)
       {
        this.data = data;
        this.next = null;
       }
    }

    public int  length()
    {
        return length;
    }


    public boolean isEmpty()
    {
       return length==0;

    }

    public void EnQueue(int data )
    {
        ListNode temp=new ListNode(data);
        if (isEmpty())
         {
            front=temp;
         }
         else
         {
            rear.next=temp;
         }
         rear=temp;
         length++;
    }

    public int deQueue()
    {
        if (isEmpty()) 
        {
            throw new NoSuchElementException("Queue is Empty");
        }

        else
        {
            int result = front.data;
            front=front.next;
            if (front==null) 
            {
                rear=null;
            }
            length--;
            return result;

        }
    }

      public void display()
      {
        if (isEmpty()) 
        {
            System.out.println("null");
        }

        ListNode current = front;

        while (current!=null)
         {
            System.out.println(current.data+"  ");
            current=current.next;
         }
      }

    public static void main(String[] args) {
        QueueImple queue= new QueueImple();
        queue.EnQueue(1);
        queue.EnQueue(2);
        queue.EnQueue(3);
        queue.display();
        int deQueueElement=queue.deQueue();
        System.out.println("-------------------------------------"+deQueueElement);
        queue.display();
    }

}


