public class skippingString {

    static void skipString(String str, int index, String ans) {
        if (index >= str.length()) {
            System.out.println(ans);
            return;
        }

        if (str.startsWith("apple", index)) {
            skipString(str, index + "apple".length(), ans);
        } else {
            skipString(str, index + 1, 
                       ans.concat(String.valueOf(str.charAt(index))));
        }
    }
    
    public static void main(String[] args) {
        skipString("Heyapplepieapple", 0, "");
    }
}

