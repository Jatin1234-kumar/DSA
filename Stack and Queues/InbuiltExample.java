import java.util.Stack;

public class InbuiltExample{
        public static void main (String[] args){
            Stack<Integer> stack = new Stack<>();
            stack.push(34);
            stack.push(44);
            stack.push(54);
            stack.push(64);
            stack.push(74);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
}