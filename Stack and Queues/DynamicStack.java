public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
            int[] temp = new int[data.length*2];

            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }

            data=temp;
        }
        return super.push(item);
    }

    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);
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
