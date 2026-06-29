public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    public boolean insert(int item) {
        if (isFull()) {
            int[] newData = new int[data.length * 2];
            for (int i = 0; i < size; i++) {
                newData[i] = data[(front + i) % data.length];
            }
            data = newData;
            front = 0;
            end = size;
        }

        return super.insert(item);
    }
public static void main(String[] args) throws QueueException {
        DynamicQueue queue = new DynamicQueue(3);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);

        queue.insert(40);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.insert(50);
        queue.insert(60);

        queue.display();
    }
    
}
