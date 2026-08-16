class Solution {

    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        int n = a.length;
        int m = b.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        while (i < n || j < m) {

            if (i == n) {

                if (arr.isEmpty() || arr.get(arr.size() - 1) != b[j]) {
                    arr.add(b[j]);
                }

                j++;
            }

            else if (j == m) {

                if (arr.isEmpty() || arr.get(arr.size() - 1) != a[i]) {
                    arr.add(a[i]);
                }

                i++;
            }

            else if (a[i] < b[j]) {

                if (arr.isEmpty() || arr.get(arr.size() - 1) != a[i]) {
                    arr.add(a[i]);
                }

                i++;
            }

            else if (a[i] > b[j]) {

                if (arr.isEmpty() || arr.get(arr.size() - 1) != b[j]) {
                    arr.add(b[j]);
                }

                j++;
            }

            else {

                if (arr.isEmpty() || arr.get(arr.size() - 1) != a[i]) {
                    arr.add(a[i]);
                }

                i++;
                j++;
            }
        }

        return arr;
    }
}