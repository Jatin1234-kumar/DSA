import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args){
       Queue<Integer> queue = new LinkedList<>();
         queue.add(34);         
         queue.add(44);         
         queue.add(54);         
         queue.add(64);         

         System.out.println(queue.peek());
         System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
