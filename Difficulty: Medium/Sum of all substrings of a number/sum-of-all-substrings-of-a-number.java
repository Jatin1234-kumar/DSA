class Solution {
    public static int sumSubstrings(String s) {
        return substrings(s, 0, 0, 0);
    }

    static int substrings(String s, int start, int end, int sum) {
        if (start == s.length()) {
            return sum;
        }

        if (end == s.length()) {
            return substrings(s, start + 1, start + 1, sum);
        }

        sum += Integer.parseInt(s.substring(start, end + 1));

        return substrings(s, start, end + 1, sum);
    }
}