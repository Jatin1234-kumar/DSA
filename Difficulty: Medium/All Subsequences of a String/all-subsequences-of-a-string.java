class Solution {
    public List<String> powerSet(String s) {
        List<String> ans = new ArrayList<>();
        allsubseq(s,0,"",ans);
        Collections.sort(ans);
        return ans;
    }
    
    void allsubseq(String s,int index,String cur,List<String> ans){
        if(index==s.length()){
            ans.add(cur);
            return;
        }
        allsubseq(s,index+1,cur+s.charAt(index),ans);
        allsubseq(s,index+1,cur,ans);
    }
}