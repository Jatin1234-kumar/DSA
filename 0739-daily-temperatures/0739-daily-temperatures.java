class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer=new int[temperatures.length];
        Arrays.fill(answer,0);

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty()&& temperatures[stack.peek()]<temperatures[i]){
                int StackTop=stack.pop();
                answer[StackTop]=i-StackTop;
            }
            stack.push(i);
        }
            return answer;
    }
}