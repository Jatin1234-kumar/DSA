public class phonepattern {
    public static void main(String[] args) {
        pattern("", "23");
    }

    static void pattern(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        // correct start index
        int start = (digit - 2) * 3;

        // shift after 7 (because pqrs = 4 letters)
        if (digit > 7) {
            start += 1;
        }

        // length decide
        int length = (digit == 7 || digit == 9) ? 4 : 3;

        for (int i = start; i < start + length; i++) {
            char ch = (char) ('a' + i);
            pattern(p + ch, up.substring(1));
        }
    }
}