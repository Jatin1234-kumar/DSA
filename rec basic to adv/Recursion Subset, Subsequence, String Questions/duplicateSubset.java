import java.util.List;
import java.util.ArrayList;

public class duplicateSubset {
    public static void main(String[] args) {
        List<List<Integer>> result = subset(new int[]{1,2,2});
        System.out.println(result);
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal= new ArrayList<>();
                internal.addAll(outer.get(i));
                internal.add(num);
                if(!outer.contains(internal)){
                    outer.add(internal);
                }
            }
        }
        return outer;
    }
}
