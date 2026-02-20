public class linearSearchArraybyRec {
    
    static boolean found = false;  
    
    static void search(int[] arr, int i, int item){
        if(i == arr.length){
            if(!found){
                System.out.println("element not found");
            }
            return;
        }
        
        if(arr[i] == item){
            System.out.println("element found at pos " + i);
            found = true;   
        }
        
        search(arr, i + 1, item);
    }

    public static void main(String[] args) {
       search(new int[]{1,3,4,5,4}, 0, 4);
    }
}

