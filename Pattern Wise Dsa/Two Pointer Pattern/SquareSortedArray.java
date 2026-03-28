    import java.util.*;
    public class SquareSortedArray {

    public static int[] sortedSquares(int[] nums) {
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        int[] result;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }

        Collections.reverse(neg);

        if(neg.size() == 0){
            pos.replaceAll(x -> x * x);
            result = new int[pos.size()];
            for (int i = 0; i < pos.size(); i++) {
                result[i] = pos.get(i);
            }
            return result;

        } else if(pos.size() == 0){
            neg.replaceAll(x -> x * x);
            result = new int[neg.size()];
            for (int i = 0; i < neg.size(); i++) {
                result[i] = neg.get(i);
            }
            return result;

        } else {
            int i = 0, j = 0, id = 0;
            result = new int[pos.size() + neg.size()];

            while(i < neg.size() && j < pos.size()){
                if(Math.abs(neg.get(i)) < Math.abs(pos.get(j))){
                    result[id++] = neg.get(i) * neg.get(i);
                    i++;
                } else {
                    result[id++] = pos.get(j) * pos.get(j);
                    j++;
                }
            }

            while(i < neg.size()){
                result[id++] = neg.get(i) * neg.get(i);
                i++;
            }

            while(j < pos.size()){
                result[id++] = pos.get(j) * pos.get(j);
                j++;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}
