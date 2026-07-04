import java.util.Stack;

class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int water = 0;

        for (int i = 0; i < height.length; i++) {

            while (!stack.isEmpty() && height[stack.peek()] <= height[i]) {

                int stackTop = stack.pop();

                if (!stack.isEmpty()) {
                    int h = Math.min(height[stack.peek()], height[i]) - height[stackTop];
                    int w = i - stack.peek() - 1;
                    water += h * w;
                }
            }

            stack.push(i);
        }

        return water;
    }
}