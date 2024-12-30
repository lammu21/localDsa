package GetStrongHold;
import java.util.Stack;

public class ReverseStack {

    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Remove the top element
            int top = stack.pop();

            // Reverse the remaining stack
            reverseStack(stack);

            // Insert the top element at the bottom
            insertAtBottom(stack, top);
        }
    }

    private static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
        } else {
            // Remove the top element
            int top = stack.pop();

            // Recur for the remaining stack
            insertAtBottom(stack, element);

            // Insert the top element back
            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(7);
        stack.push(6);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}


