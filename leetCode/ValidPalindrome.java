package leetCode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder newStr = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i)>=48 && s.charAt(i)<=57)) {
                newStr.append(s.charAt(i));
            }
        }
        StringBuilder str=new StringBuilder("");
        str.append(newStr.reverse());
        newStr.reverse();
        String first=str.toString();
        String second=newStr.toString();
        if(first.equals(second)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "a011a";
        System.out.println(validPalindrome.isPalindrome(s));
    }
}
// abcba length 5 5/2= 2 1/3
//abccba length 6 6/2 3 3-1