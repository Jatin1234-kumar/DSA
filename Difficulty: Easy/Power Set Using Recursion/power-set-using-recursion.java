
class Solution {
    public ArrayList<String> powerSet(String s) {
        ArrayList<String> ans = new ArrayList<>();

        powerSet(s, 0, "", ans);

        return ans;
    }

    void powerSet(String s, int index, String curr, ArrayList<String> ans) {
        if (index == s.length()) {
            ans.add(curr);
            return;
        }

        powerSet(s, index + 1, curr, ans);

        powerSet(s, index + 1, curr + s.charAt(index), ans);
    }
}

