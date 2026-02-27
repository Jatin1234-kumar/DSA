public class ASCIIsubsequence {
    static void subsequenceASCII(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subsequenceASCII(p+ch, up.substring(1));
        subsequenceASCII(p, up.substring(1));
        subsequenceASCII(p+(ch+0), up.substring(1));
    }

    public static void main(String[] args) {
        subsequenceASCII("", "abc");
    }
}
