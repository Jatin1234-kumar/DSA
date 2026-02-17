class Palindrome {

    int revnum(int n, int reverse) {
        if (n == 0) {
            return reverse;
        }
        return revnum(n / 10, reverse * 10 + n % 10);
    }

    void palindrome(int n) {
        if (n == revnum(n, 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        Palindrome m = new Palindrome();
        m.palindrome(1234321);
    }
}
