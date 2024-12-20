package Linked_list.Doubly_Lisked_list;

class Node {
    int data;
    Node next;
    Node previous;
    public Node(int data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;

    }
    


    
}

public class Doubly_lisked_list {

    public static Node convert_Array_To_DDL(int []arr){
         Node head= new Node(arr[0]);
         Node previous_pointer=head;
         for (int i = 1; i < arr.length; i++) {
            Node new_node= new Node(arr[i],null,previous_pointer);
            previous_pointer.next=new_node;
            previous_pointer=new_node;
         }
         return head;

    }

    public static Node delete_head_DDL(Node head){
        if (head==null||head.next==null) {
            return null;
        }
        Node previous_head= head;
        head=head.next;
        previous_head.next=null;
        head.previous=null;

        return head;
    }

    public static Node delete_tail_DDL(Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node tail = head;
        while(tail.next!=null){
            tail=tail.next;

        }
        Node previous_node1 = tail.previous;
        previous_node1.next=null;
        tail.previous=null;

        return head;
    }


    public static Node delete_K_element_in_DLL(Node head,int k){
    //   if head is null i.e DDL is emppty
      
        if(head==null){
            return null;
        }
        if(k==0){
            System.out.println("DDL dont have 0th element ");
            return head;
        }

        // finding the k element in DDL
        Node current = head;
        int count =0;
        while (current!=null) {
            count++;
           if(count==k){
            break;
           }
           current=current.next;
        }
        if (current!=null) {
            

        // // check for Kth element is first Node 
        if(current.previous==null){
         
            return delete_head_DDL(head);

        }
      
       Node prvious_node=current.previous;


        // check for Kth element is Last Node 
        if (current.next==null) {
            return delete_tail_DDL(head);
        }
        Node frontNode=current.next;
       

    //   checking if DDL has only one NODE 

        if(prvious_node==null&&frontNode==null){
            return null;
        }

       


      
//    Deleting the Kth Node from DDL

        prvious_node.next=frontNode;
        frontNode.previous=prvious_node;
        current.previous=null;
        current.next=null;

    }

        return head;
        }



    public static Node delete_given_Node_in_DLL(Node head,int value){
           // finding the k element in DDL
        Node current = head;
     
        while (current!=null) {
     
           if(current.data==value){
            break;
           }
           current=current.next;
        }
        
        if (current!=null) {
            
        
        // // check for Kth element is first Node 
        if(current.previous==null){
         
            return delete_head_DDL(head);

        }
      
       Node prvious_node=current.previous;


        // check for Kth element is Last Node 
        if (current.next==null) {
            return delete_tail_DDL(head);
        }
        Node frontNode=current.next;
       

    //   checking if DDL has only one NODE 

        if(prvious_node==null&&frontNode==null){
            return null;
        }
        

//    Deleting the Kth Node from DDL

        prvious_node.next=frontNode;
        frontNode.previous=prvious_node;
        current.previous=null;
        current.next=null;
        }

        return head;
    }


        public static Node insert_Before_tail(Node head,int value){
            Node current=head;

            // while loop to reach tail
            while (current.next!=null) {
  
              current=current.next;
              
            }
            // adding new_node before Tail
            Node tail_back=current.previous;
            Node new_Node_before_tail=new Node(value,current,tail_back);
            tail_back.next=new_Node_before_tail;
            current.previous=new_Node_before_tail;
           return head;
      }

      public static Node insert_Before_head(Node head,int value){
            Node new_head=new Node(value,head,null);
            head.previous=new_head;
            head=new_head;
        return head;
      }


    public static Node insert_Before_Kth_Node(Node head,int k,int value){

      
        // finding Kth Node in DLL
        Node current = head;
        int count=0;
        while (current!=null) {
            count++;
            if (count==k) {
               break;
            }
            current=current.next;
        }

        if (current!=null) {
            
      
        
        // if Kth Node is head calling insert_Before_head method

        if (current.previous==null) {
           head= insert_Before_head(head, value);
           return head;
        }
          Node back=current.previous;

          //if Kth Node is tail calling insert_Before_tail method

        if (current.next==null) {
            head= insert_Before_tail(head, value);
            return head;
         }

         Node front=current.next;

        //  if DLL has single Node returning Null

         if (back==null&&front==null) {
            return null;
         }
         

        //  Adding NODe at Kth element 

         Node new_node= new Node(value,current,back);
         current.previous=new_node;
         back.next=new_node;

        }


   return head;

    }


    public static Node insert_Before_Given_Node(Node head,int before,int value){
      
        // finding Kth Node in DLL
        Node current = head;
      
        while (current!=null) {
         
            if (current.data==before) {
               break;
            }
            current=current.next;
        }

        if (current!=null) {
            
      
        
        // if Kth Node is head calling insert_Before_head method

        if (current.previous==null) {
           head= insert_Before_head(head, value);
           return head;
        }
          Node back=current.previous;

          //if Kth Node is tail calling insert_Before_tail method

        if (current.next==null) {
            head= insert_Before_tail(head, value);
            return head;
         }

         Node front=current.next;

        //  if DLL has single Node returning Null

         if (back==null&&front==null) {
            return null;
         }
         

        //  Adding NODe at Kth element 

         Node new_node= new Node(value,current,back);
         current.previous=new_node;
         back.next=new_node;

        }

   return head;

    }


 public static Node reverseDLL(Node  head)
{
    //Your code here

    // Optimal Approach
    Node temp=null;
    Node current=head;
    while(current!=null){
        
        
        temp = current.previous;
        current.previous=current.next;
        current.next=temp;
        current=current.previous;
    }
    System.out.println(temp.data);
    return temp.previous;
}

static void addNode(Node head_ref, int pos, int data)
	{
		Node current =head_ref;
        int count =0;
        while (current!=null&&count<pos) {
            count++;
            current=current.next;
        }

        if (current==null) {
            return;
        }

        Node newNode=new Node(data);
        newNode.next = current.next;
        newNode.previous = current;
        if (current.next != null) {
            current.next.previous = newNode;
        }
        current.next = newNode;
        // if(current.next!=null){
        //    Node next_node=current.next;
        //    new_node.next=next_node;
        //    new_node.previous=current;
        //    current.next=new_node;
        //    next_node.previous=new_node;
        // }
        

    }

    public static void printDDL(Node head){
      
       Node current = head;
      while (current!=null) {
         System.out.print("<-"+current.data+"->");
         current=current.next;
      }
    }

   
    public static void main(String[] args) {
        int [] arr={2,4,5};
        Node head=convert_Array_To_DDL(arr);
        // printDDL(head);
        // System.out.println("----------------------");
        // head=delete_head_DDL(head);
        // System.out.println("after head gone");
        // printDDL(head);
       
        // head=delete_head_DDL(head);
        // System.out.println("after tail gone");
        // printDDL(head);


        // head =delete_K_element_in_DLL(head, 6);
        // printDDL(head);

        // head=insert_Before_tail(head,8);
        // printDDL(head);

        // head=insert_Before_Kth_Node(head,6,99);
        // printDDL(head);
        // head=delete_given_Node_in_DLL(head, 6);
        // printDDL(head);

        // head=insert_Before_Given_Node(head, 0,99);
        // printDDL(head);
        // head=reverseDLL(head);
        addNode(head, 2, 6);
        printDDL(head);


    }
}

