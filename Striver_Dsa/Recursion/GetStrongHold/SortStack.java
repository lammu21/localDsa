package GetStrongHold;

import java.util.Stack;

public class SortStack {

    public static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Remove the top element
            int top = stack.pop();

            // Sort the remaining stack
            sort(stack);

            // Insert the top element back in sorted order
            sortedInsert(stack, top);
        }
    }

    private static void sortedInsert(Stack<Integer> stack, int element) {
        // Base case: If stack is empty or the top element is less than the element to be inserted
        if (stack.isEmpty() || stack.peek() < element) {
            stack.push(element);
        } else {
            // Remove the top element
            int top = stack.pop();

            // Recur for the remaining stack
            sortedInsert(stack, element);

            // Insert the top element back
            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);

        sort(stack1);

        System.out.println("Sorted Stack: ");
        while (!stack1.isEmpty()) {
            System.out.print(stack1.pop() + " ");
        }

        System.out.println();

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(11);
        stack2.push(2);
        stack2.push(32);
        stack2.push(3);
        stack2.push(41);

        sort(stack2);

        System.out.println("Sorted Stack: ");
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop() + " ");
        }
    }
}

    

