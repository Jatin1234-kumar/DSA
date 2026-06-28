public class CustomQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }

        data[end] = item;
        end++;
        return true;
    }

    public boolean isFull() {
        return end == data.length;
    }

    public int remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }

        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        end--;

        return removed;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public int front() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }

        return data[0];
    }

    public static void main(String[] args) throws QueueException {

        CustomQueue queue = new CustomQueue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        System.out.println(queue.front());

        System.out.println(queue.remove());

        System.out.println(queue.front());
    }
}