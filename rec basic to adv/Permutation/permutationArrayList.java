import java.util.ArrayList;
import java.util.List;

public class permutationArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        permute("", "abc", list);
        System.out.println(list);  
    }

    static void permute(String p, String up, List<String> list) {

        if (up.isEmpty()) {
            list.add(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);
            permute(first + ch + second, up.substring(1), list);
        }
    }
}