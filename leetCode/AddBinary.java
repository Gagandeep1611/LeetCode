package leetCode;

public class AddBinary {
    public String addBinary(String a, String b) {
        int alength=a.length()-1, blength=b.length()-1;
        int substitute=0;
        String c="";
        while(alength>=0 && blength>=0){
            if(a.charAt(alength)=='0' && b.charAt(blength)=='0'){
               if(substitute==0){
                   c="0".concat(c);
               } else if(substitute==1){
                   c="1".concat(c);
                   substitute=0;
               }
               alength--;
               blength--;
            }else if(a.charAt(alength)=='1' && b.charAt(blength)=='1'){
                if(substitute==0){
                    c="0".concat(c);
                } else if(substitute==1){
                    c="1".concat(c);
                }
                substitute=1;
                alength--;
                blength--;
            }else if((a.charAt(alength)=='0' && b.charAt(blength)=='1') ||
                    (a.charAt(alength)=='1' && b.charAt(blength)=='0')){
                if(substitute==0){
                    c="1".concat(c);
                } else if(substitute==1){
                    c="0".concat(c);
                    substitute=1;
                }
                alength--;
                blength--;
            }
        }
        if(alength>=0){
         while(alength>=0){
             if(a.charAt(alength)=='0'){
                 if(substitute==0){
                     c="0".concat(c);
                 }else if(substitute==1){
                     c="1".concat(c);
                     substitute=0;
                 }
             }else if(a.charAt(alength)=='1'){
                 if(substitute==0){
                     c="1".concat(c);
                 }else if(substitute==1){
                     c="0".concat(c);
                     substitute=1;
                 }
             }
             alength--;
         }
        }else if(blength>=0){
            while(blength>=0){
                if(b.charAt(blength)=='0'){
                    if(substitute==0){
                        c="0".concat(c);
                    }else if(substitute==1){
                        c="1".concat(c);
                        substitute=0;
                    }
                }else if(b.charAt(blength)=='1'){
                    if(substitute==0){
                        c="1".concat(c);
                    }else if(substitute==1){
                        c="0".concat(c);
                        substitute=1;
                    }
                }
                blength--;
            }
        }
        if(alength<0 && blength<0){
            if(substitute==1){
                c="1".concat(c);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String a="0";
        String b="0";
        AddBinary binary=new AddBinary();
        System.out.println(binary.addBinary(a, b));
    }
}
