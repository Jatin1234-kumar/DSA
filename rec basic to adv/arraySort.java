public class arraySort {
    static void  sort(int[] arr, int i){
        if(i==arr.length-1){
            System.out.println("array is sorted");
            return;
        }
        
        if(arr[i]<arr[i+1]){
            sort(arr , i+1);
        }else{
            System.out.println("array is not sorted");
            return;
        }
    }
    public static void main(String[] args) {
       sort(new int[]{1,3,4,5,6},0);
    }
}
