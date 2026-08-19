class Solution {

    public boolean validMountainArray(int[] arr) {

        int i = 0;
        int n = arr.length - 1;

        if (arr.length < 3) {
            return false;
        }

        boolean down = false;

        while (i < n) {

            if (arr[i] == arr[i + 1]) {
                return false;

            } else if (arr[i] < arr[i + 1]) {

                if (down) {
                    return false;
                }

                i++;

            } else {

                down = true;
                i++;
            }
        }

        return down && i == n && arr[0] < arr[1];
    }
}