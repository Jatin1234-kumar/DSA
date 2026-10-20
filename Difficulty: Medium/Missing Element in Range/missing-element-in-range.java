class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=low && arr[i]<=high){
                set.add(arr[i]);
            }
        }
        
        for(int i=low;i<high+1;i++){
            if(set.contains(i)==false){
                list.add(i);
            }
        }
        
        return list;
    }
}