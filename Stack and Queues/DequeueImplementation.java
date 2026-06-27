import java.util.Deque;
import java.util.ArrayDeque;

public class DequeueImplementation {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(102);
        deque.addLast(12);
        System.out.println(deque.remove(126));  //this will print false as element is not present in the deque
        System.out.println(deque.remove(12));  //this will print true as element is present in the deque
        System.out.println(deque.removeLast());
    }
}
