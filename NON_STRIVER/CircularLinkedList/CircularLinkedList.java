package CircularLinkedList;

public class CircularLinkedList 
{
     
  

    ListNode last;
    int length;

    public CircularLinkedList() 
    {
        this.last = null;
        this.length = 0;
    }

    class ListNode
    {
        private int data;
        private ListNode next;
       
    public ListNode(int data) {
        
        this.data = data;
        this.next=next;

        }
        
    }

    public ListNode createCircularLinkedList()
    {
        ListNode f = new ListNode(0);
        ListNode s = new ListNode(1);
        ListNode t = new ListNode(2);
        ListNode fO = new ListNode(3);
        ListNode fifth = new ListNode(4);
                

        f.next=s;
        s.next=t;
        t.next=fO;
        fO.next=fifth;
        fifth.next=f;
        
        last=fifth;

        return last;

    }


    public void insertFirstCircularLiskedList(int value)
    {
        ListNode newNode= new ListNode(value);

        if(last==null)
        {
            last.next=newNode;
        }
        else{
            newNode.next=last.next;
            last.next=newNode;
        }

    }

    public void insertLastCircularLiskedList(int value)
    {
         ListNode newNode= new ListNode(value);

        if(last==null)
        {
            last=newNode;
        }
        else
        {
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }

    }
    

    public void display()
    {
        ListNode first=last.next;
        if(last==null)
        {
           return;
        }
        while (first!=last)
        {
            System.out.println(first.data+"-->");
            first=first.next;
        }
        System.out.println(last.data);
    }


    public static void main(String[] args) {
        CircularLinkedList cLs=new CircularLinkedList();

        cLs.createCircularLinkedList();
        cLs.insertFirstCircularLiskedList(5);
        cLs.insertLastCircularLiskedList(7);
        cLs.display();
    }

}
