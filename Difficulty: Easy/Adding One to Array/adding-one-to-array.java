class Solution {
    Vector<Integer> addOne(int[] arr) {
        Vector<Integer> result = new Vector<>();

        int i = arr.length - 1;
        while (i >= 0 && arr[i] == 9) {
            arr[i] = 0;
            i--;
        }
        if (i >= 0) {
            arr[i]++;
        } else {
            result.add(1);
        }
        for (int j = 0; j < arr.length; j++) {
            result.add(arr[j]);
        }

        return result;
    }
}