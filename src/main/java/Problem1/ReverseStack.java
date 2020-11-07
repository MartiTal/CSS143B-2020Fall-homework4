package Problem1;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        // homework
        if (!stack.empty()) {
            Integer value = stack.pop();
            reverseStack(stack);
            reverseStackHelper(stack, value);
        }
    }

    //I was not using my helper function correctly. This resource helped me understand the order in which to do things.
    // https://algorithms.tutorialhorizon.com/reverse-a-stack-using-recursion-in-place-without-using-extra-memory/
    private static void reverseStackHelper(Stack<Integer> stack, int num) {

        if (stack.empty()) {
            stack.push(num);
            return;
        }

        int temp = stack.pop();

        reverseStackHelper(stack, num);

        stack.push(temp);

    }
}