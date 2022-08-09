package leetCode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int pointer=s.length()-1,count=0;
        while(pointer>-1){
            if(s.charAt(pointer)!=' ') {
                pointer--;
                count++;
            }else{
                return count;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String s="a";
        LengthOfLastWord word=new LengthOfLastWord();
        System.out.println(word.lengthOfLastWord(s));

    }
}
