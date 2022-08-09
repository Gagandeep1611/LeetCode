package leetCode;

public class TestFunctions {
    public static void main(String[] args) {
        String str="A ,: 12 mAn2";
        System.out.println(str);
        str=str.toLowerCase();
        StringBuilder newStr= new StringBuilder(new String());
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                newStr.append(str.charAt(i));
            }
        }
        System.out.println(newStr);
        newStr=newStr.reverse();
        System.out.println(newStr);


    }
}
