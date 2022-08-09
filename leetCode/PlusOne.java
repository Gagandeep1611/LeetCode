package leetCode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                if(i==0){
                    digits[i]=0;
                    int[] newdigits=new int[digits.length+1];
                    newdigits[0]=0;
                    for(int j=1;j< newdigits.length;j++){
                        newdigits[j]=digits[j-1];
                        }
                    newdigits[0]++;
                    return newdigits;
                    }
                else{
                    digits[i]=0;
                }
            }else if(digits[i]>=0 && digits[i]<9){
                digits[i]++;
                break;
            }
        }
        return digits;

    }

    public static void main(String[] args) {
        int[] digits={9};
        PlusOne num=new PlusOne();
        int[] result=num.plusOne(digits);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
