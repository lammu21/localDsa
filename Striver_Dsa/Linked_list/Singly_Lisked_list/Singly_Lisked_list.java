package Linked_list.Singly_Lisked_list;

import java.util.ArrayList;
import java.util.Collections;

import Striver_Dsa.Recursion_Problems.reverseArray;

/**
 * Singly_Lisked_list
 * 
 */

class Node{
    int data;
    Node next;
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    public Node(int data) {
        this.data = data;
        this.next=null;
    }

    
}
public class Singly_Lisked_list {



    public static Node delete_At_Position(Node head,int position){
      
    //    if Linked_list is empty return empty
      
        if(head==null||head.next==null){
            return head;

        }
    //    if position to be delete is head 
        // if(position==1){
        //     head=head.next;
        //     return head;
        // }
    // initialiing current for traversal 
    // and previous which is used to delete node when we got position 
        Node current = head;
        int length =0;
        while (current!=null) {
            length++;
            current=current.next;
        }
        // System.out.println(length);
        current=head;
        Node previous=null;
        // int counter = 0;

        while (current!=null) {
            // counter++;
            length--;
            if (length+1==position) {
                previous.next=previous.next.next;
                return head;
            }
            previous=current;
            current=current.next;

        }
         return head;
    }


    public static Node delete_Given_Value(Node head, int value){
        if (head==null) {
            return null;
        }

        Node current = head;
        Node previous=null;
        while (current!=null) {
            if (current.data==value) {
                previous.next=previous.next.next;
                return head;
            }
            previous=current;
            current=current.next;
        }
        return head;
    }

    public static Node insert_at_head(Node head, int value){
    //  creating new Node with given value
        Node new_head= new Node(value);

//    instead of inserting like this new_head.next=head;  you can added like below
    // Node new_head= new Node(value,head);

    // inserting new Node before head Node 
       new_head.next=head;

// making new node as head 
    
        head=new_head;
        return head;
    }
    public static Node insert_at_end(Node head, int value){
        //  creating new Node with given value
            Node new_Node= new Node(value);

            Node current=head;

            // while(current.next!=null){
            //     current=current.next;
            // }
            while (current==current) {
                System.out.println("hi");
                return current;

                
            }
          
    
        // inserting new Node at the end 
        current.next=new_Node;
        return head;
    }


    public static Node insert_At_position(Node head, int position,int value){
          
    //    CASE:1 if linkedlist is null and if add node at position 1 
        if (head==null) {
            if(position==1){
                Node new_head=new Node(value);
                return new_head;
            }
            else{
                return head;
            }
          }

//    CASE:2 if given position is 1
          if(position==1){
            Node new_head=new Node(value,head);
            return new_head;
          }
    // CASE:3 if given position >1

          Node current = head;

    //counter is to track position
          int counter=0;
        
          while(current!=null){
            counter++;
    //if condition is to stop before position
            if(counter==position-1){
                Node new_node= new Node(value,current.next);
                current.next=new_node;
                break;
            }
           current=current.next;
          }
          return head;
    }


    public static Node insert_After_given_value(Node head, int element,int value){
          
       
    
    //    CASE:1 if given position is 1
              if(head.data==element){
                Node new_head=new Node(value,head);
                return new_head;
              }
        // CASE:2 if given element not at head 
    
              Node current = head;
    
             while(current.next!=null){
           
        //if condition is to stop before position
                if(current.next.data==element){
                    Node new_node= new Node(value,current.next);
                    current.next=new_node;
                    break;
                }
               current=current.next;
              }
              return head;
        }


        public static Node oddEvenList(Node head) {
            if(head==null||head.next==null){
                return head;
            }
           ArrayList<Integer> arr = new ArrayList<>();
           Node current=head;
         while(current!=null&&current.next!=null){
            arr.add(current.data);
            current=current.next.next;
           }
           if(current.data){
            arr.add(current.data);
           }
           current=head.next;
           while(current!=null&&current.next.next!=null){
            arr.add(current.data);
            current=current.next.next;
           }
           if(current.data){
            arr.add(current.data);
           }
          current=head;
          int i=0;
           while(current!=null){
            current.data=arr.get(i);
            i++;
            current=current.next;
           }
           return head;

        
    }


    public static Node removeNthFromEnd(Node head, int n) {

        //    if Linked_list is empty return empty
   
     if(head==null||head.next==null){
         return null;

     }

     Node current = head;
     int length =0;
     while (current!=null) {
         length++;
         current=current.next;
     }

     int result=length-n;

     if(result==0){
         // head=head.next;
         Node newhead= head.next;
         head=newhead;
         return head;
     }

     current=head;
    Node previous=null;
     // int counter = 0;

     while (current!=null) {
         // counter++;
         result--;
         if (result==0) {
             break;
         }
         current=current.next;
      }
      
     Node delNode = current.next;
     current.next = current.next.next;
     delNode = null;
     
     return head;

     

}
public static Node sortList(Node head) {
    ArrayList <Integer> arr = new ArrayList<>();
    Node current = head;
    while (current!=null) {
        arr.add(current.data);
        current=current.next;
        
    }
    Collections.sort(arr);
    current=head;
    int index=0;
    while (current!=null) {
        current.data=arr.get(index);
        index++;
        current=current.next;
        
    }


    return head;

    
}



 public static void display_linked_list(Node head){
        Node current = head; 
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }
    }



     
    public static void main(String[] args) {
        Node head= new Node(5);
        // head.next=second;
        Node second = new Node(4);

        Node third=new Node(2);

        Node fourth = new Node(3);

        Node fifth= new Node(1);


        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        // X

        //  head =delete_At_Position(head, 2);
        // head=oddEvenList(head);
        // head = delete_Given_Value(head, 5);
        // head=insert_After_given_value(head, 1,77);
        // head=removeNthFromEnd(head,4);
        //  head=sortList(head);
        head=insert_at_end(head,1);

        display_linked_list(head);

    }
}