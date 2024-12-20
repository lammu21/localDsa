package stack;

public class Stack_Using_Array {
    
    private int top;
    private int [] array;

    public Stack_Using_Array( int capacity ) {
        
        top =-1;
        array= new int[capacity];
    }

    public Stack_Using_Array() {
        this(10);

    }

    public boolean isEmpty()
    {
        return top<0;
    }

    public boolean isFull()
    {
        return array.length==top+1;
    }


    public void push ( int data) throws StackOverFlowException
    {
        if (isFull())
        {
            throw new StackOverFlowException("Stack is full");
            
        }

        top++;
        array[top]=data;


    }

    public int pop() throws StackUnderFlowException
    {
        if (isEmpty()) {

            throw new StackUnderFlowException("stack is empty");
            
        }

        int poped_Element=array[top];
        top--;
        return poped_Element;
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) throws StackOverFlowException, StackUnderFlowException {
        Stack_Using_Array stack_Using_Array = new Stack_Using_Array(3);

        stack_Using_Array.push(10);

        stack_Using_Array.push(11);

        System.out.println(stack_Using_Array.pop());

        stack_Using_Array.display();
    }

}    



