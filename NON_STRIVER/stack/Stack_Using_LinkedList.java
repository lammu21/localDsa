package stack;

public class Stack_Using_LinkedList<T> {
    
    private int length;
    private Node<T> top;

    public Stack_Using_LinkedList() {
        top = null;
        length = 0;
    }

    // tell if stack is empty

    public boolean isEmpty()
    {
        return length==0;
    }

// Returns stack length 

   public int length()
   {
    return length;
   }

   public void push (T data )
   {
     Node <T> new_node = new Node<T>(data);

    new_node.next=top;

    top=new_node;
    length++;


   }

    public T pop () throws StackUnderFlowException
    {
          if(isEmpty())
          {
            throw new StackUnderFlowException("Stack is Empty");
          }
          @SuppressWarnings("unchecked")
          T poped_Element = top.data;

          top= top.next;
          length--;

        return (T) poped_Element;
    }

   

   public void displayStack()
   {

    Node <T> current = top;

    while (current!=null) 
    {

        System.out.print(current.data+"-->");
        current=current.next;
        
    }

    System.out.println("Null");
     
   }



}
