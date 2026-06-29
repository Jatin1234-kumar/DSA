public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    int front = 0;
    int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int capacity) {
        this.data = new int[capacity];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }

        data[end] = item;
        end = (end + 1) % data.length;
        size++;
        return true;
    }

    public int remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }

        int removed = data[front];
        front = (front + 1) % data.length;
        size--;
        return removed;
    }

    public int front() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }

        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        for (int count = 0; count < size; count++) {
            System.out.print(data[i] + " <-- ");
            i = (i + 1) % data.length;
        }

        System.out.println("END");
    }

    public static void main(String[] args) throws QueueException {

        CircularQueue queue = new CircularQueue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        System.out.println("Initial Queue:");
        queue.display();

        queue.remove();
        queue.remove();

        System.out.println("\nAfter removing two elements:");
        queue.display();

        queue.insert(60);
        queue.insert(70);

        System.out.println("\nAfter inserting 60 and 70 (wrap around):");
        queue.display();

        System.out.println("\nFront element: " + queue.front());
    }
}