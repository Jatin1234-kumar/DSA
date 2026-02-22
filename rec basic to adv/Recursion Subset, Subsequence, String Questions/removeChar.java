public class removeChar {
static void skipchar(String str, int index, String ans) {
        if (index >= str.length()) {
            System.out.println(ans);
            return;
        }

        if (str.charAt(index) != 'a') {
            skipchar(str, index + 1, ans + str.charAt(index));
        } else {
            skipchar(str, index + 1, ans);
        }
    }

    public static void main(String[] args) {
        skipchar("Heyaa", 0, "");
    }
}

