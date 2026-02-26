import java.util.ArrayList;

public class arraylistOfString {
    public static void main(String[] args) {
        System.out.println(subseqList("", "abc"));
    }

    static ArrayList<String> subseqList(String p,String up){
        ArrayList<String> List= new ArrayList<>();
        if(up.isEmpty()){
            List.add(p);
            return List;
        }
        char ch = up.charAt(0);
        List.addAll(subseqList(p+ch,up.substring(1)));
        List.addAll(subseqList(p, up.substring(1)));
        return List;
    }
}
