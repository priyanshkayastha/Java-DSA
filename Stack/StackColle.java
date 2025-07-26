import java.util.Stack;

public class StackColle {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();

        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(6);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
