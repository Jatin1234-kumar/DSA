public class phonepattern {
    public static void main(String[] args) {
        pattern("", "123");
    }

static void pattern(String p, String up){
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
// 2-abc, 3-def, 4-ghi, 5-jkl, 6-mno, 7-pqrs, 8-tuv, 9-wxyz
// digit-1*3 to digit*3-1
// this for loop will run 3 times for each digit except for 7 and 9 which will run 4 times. the for loop will run from (digit-1)*3 to digit*3-1, which will give us the correct range of characters for each digit. for example, for digit 2, the loop will run from 0 to 2, which will give us the characters 'a', 'b', and 'c'. for digit 3, the loop will run from 3 to 5, which will give us the characters 'd', 'e', and 'f'. and so on.
int digit=up.charAt(0)-'0';
for (int i=(digit-1)*3;i<digit*3;i++){ 
    char ch=(char)('a'+i);
    pattern(p+ch, up.substring(1));
    }
}
}