public class RotatedBinarySearch {

    public static int search(int[] arr, int start, int end, int target) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

     
        if (arr[start] <= arr[mid]) {

            if (target >= arr[start] && target < arr[mid]) {
                return search(arr, start, mid - 1, target);
            } else {
                return search(arr, mid + 1, end, target);
            }

        } else { 

            if (target > arr[mid] && target <= arr[end]) {
                return search(arr, mid + 1, end, target);
            } else {
                return search(arr, start, mid - 1, target);
            }
        }
    }

    public static void main(String[] args) {

        int result = search(new int[]{5,6,7,8,9,1,2,3}, 0, 7,9 );

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}