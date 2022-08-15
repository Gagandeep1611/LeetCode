package leetCode;

import java.util.*;

public class SecondMostRecurring {
    String temp="";
    String checkRecurrance(String s){
        List<Character> alphabets=new ArrayList<>();
        List<Integer> count=new ArrayList<>();
        alphabets.add(0,s.charAt(0));
        count.add(0,1);
        for(int i=0;i<s.length();i++){
            if(alphabets.contains(s.charAt(i))){
                int idx=alphabets.indexOf(s.charAt(i));
                int num=count.get(idx);
                count.add(idx,num+1);
            }else{
                alphabets.add(s.charAt(i));
            }
        }
        int largest;

        return temp;
    }
    public static void main(String[] args) {
        String s="aaabbbccnacancaaa";
        SecondMostRecurring recurring=new SecondMostRecurring();
        System.out.println(recurring.checkRecurrance(s));

    }
}
