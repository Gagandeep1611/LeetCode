package leetCode;

public class RomanToInteger {

    public int romanToInt(String roman){
        int num=0;
        for(int i=(roman.length()-1);i>=0;i--){

        }
        return num;
    }

    public static void main(String[] args) {
        String roman= "IV";
        RomanToInteger romanToInteger=new RomanToInteger();
        System.out.println(romanToInteger.romanToInt(roman));
    }
}

//  Symbol       Value
//  I             1
//  V             5
//  X             10
//  L             50                        "MCMXCIV"=1994
//  C             100
//  D             500
//  M             1000

/*
Pseudo Code:
function converter(string roman){
    int result, current,next;
    result=roman(roman.length()-1);
    for(int i=roman.length()-1;i>=0;i--){
        if(next>=current){
            result=result+current+next;
        }
        else{
        result=result+current-next;
        }
        current=0;
        next=0;
    }
}

* */