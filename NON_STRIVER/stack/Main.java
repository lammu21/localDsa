package stack;

public class Main {
    
    public static void main(String[] args) throws StackUnderFlowException {
        Stack_Using_LinkedList <Integer> stack_Using_LinkedList= new Stack_Using_LinkedList<>();

        stack_Using_LinkedList.push(10);
        stack_Using_LinkedList.push(11);
        stack_Using_LinkedList.push(12);

        stack_Using_LinkedList.push(13);

        
        stack_Using_LinkedList.displayStack();

        stack_Using_LinkedList.pop();

        stack_Using_LinkedList.displayStack();
    }
}
