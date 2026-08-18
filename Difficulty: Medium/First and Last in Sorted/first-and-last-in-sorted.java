class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> result=new ArrayList<>();
        int n = arr.length;
            int left = 0, right = n - 1;

            int last = -1;

            while(left <= right) {

                int mid = (left + right) / 2;

                if(x == arr[mid]) {
                    last = mid;
                    left = mid + 1;
                }

                else if(x < arr[mid])
                    right = mid - 1;

                else
                    left = mid + 1;
            }


left = 0;right = n - 1;
            int first = -1;

            while(left <= right) {

                int mid = (left + right) / 2;

                if(x == arr[mid]) {
                    first = mid;
                    right = mid - 1;
                }

                else if(x < arr[mid])
                    right = mid - 1;

                else
                    left = mid + 1;
            }

                result.add(first);
                result.add(last);
                return result;
        }
        
    }
