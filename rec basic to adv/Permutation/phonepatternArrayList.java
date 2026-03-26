import java.util.ArrayList;

class phonepatternArrayList {

    public static void main(String[] args) {
        System.out.println(pattern("", "263"));
    }

    static ArrayList<String> pattern(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        if (digit < 2 || digit > 9) {
            return pattern(p, up.substring(1));
        }

        int start = (digit - 2) * 3;

        if (digit > 7) {
            start += 1;
        }

        int length = (digit == 7 || digit == 9) ? 4 : 3;

        ArrayList<String> ans = new ArrayList<>();

        for (int i = start; i < start + length; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(pattern(p + ch, up.substring(1)));
        }

        return ans;
    }
}