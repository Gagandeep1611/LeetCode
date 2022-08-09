package leetCode;

public class strSTR { //implement strStr()
    public int strStr(String haystack, String needle) {
        String compare;
        for(int i=0;i<(haystack.length()-needle.length()+1);i++){
            compare=haystack.substring(i,(needle.length()+i));
            if(compare.equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        strSTR str=new strSTR();
        System.out.println(str.strStr("hello", "ll"));

    }
}
