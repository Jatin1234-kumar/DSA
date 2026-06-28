public class CustomStack{
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }

        ptr++;
        data[ptr]=item;
        return true;
    }

    private boolean isFull() {
        return ptr==data.length-1;
    }


    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("stack is empty");
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }

    private boolean isEmpty() {
        return ptr==-1;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("stack is empty");
        }
        return data[ptr];
    }
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);
        stack.push(12);
        stack.push(22);
        stack.push(32);
        stack.push(42);
        stack.push(52);

        System.out.println(stack.peek());

         System.out.println(stack.pop());
          System.out.println(stack.peek());
    }
}