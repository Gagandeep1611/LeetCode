package leetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        int i=0;
        String result="";
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];

        while(i<first.length() && first.charAt(i)==last.charAt(i)){
            result=result+first.charAt(i);
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        LongestCommonPrefix longestCommonPrefix=new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));

    }
}
