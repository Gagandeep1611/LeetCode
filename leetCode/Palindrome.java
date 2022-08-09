package leetCode;

public class Palindrome {
    public boolean isPalindrome(int x){
        int temp=x, reverse=0, remainder;
        if(temp>0) {
            while (x != 0) {
                remainder = x % 10;
                reverse = reverse * 10 + remainder;
                x = x / 10;
            }
        }else{
            while(x!=0){
                remainder=x%10;
                reverse=reverse*10-remainder;
                x=x/10;
            }
        }
        return temp == reverse;
    }

    public static void main(String[] args) {
        int x=10;
        Palindrome palindrome=new Palindrome();
        System.out.println(palindrome.isPalindrome(x));
    }
}
