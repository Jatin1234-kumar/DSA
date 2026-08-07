class Solution {
    public void sortInWave(int arr[]) {
        int i = 0;
        while(i<arr.length-1){
            if(i%2==0){
                if(arr[i]>=arr[i+1]){
                    i++;
                }else{
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    i++;
                }
            } else {
                if(arr[i]<=arr[i+1]){
                    i++;
                }else{
                   int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    i++; 
                }
            }
        }
    }
}
