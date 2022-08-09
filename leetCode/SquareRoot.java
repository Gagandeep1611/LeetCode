package leetCode;

public class SquareRoot {
//    public int mySqrt(int x) {
//        int left=0,right=x/2,mid;
//        if(x<=1){
//            return x;
//        }
//        while(right-left!=1){
//            mid=(left+right)/2;
//            if((right*right)==x){
//                return right;
//            }else {
//                if ((mid * mid) > x) {
//                    right = mid;
//                } else if ((mid * mid) < x) {
//                    left = mid;
//                } else if ((mid * mid) == x) {
//                    return mid;
//                }
//            }
//        }
//        return left;
//    }
    public boolean checkRoot(double x, double y){
        if((x*x)>(y-1) && (x*x)<(y+1)){
            return true;
        }
        else{
            return false;}
    }

    public double findAverage(double x, double y){
        return (x+y)/2.0d;
    }

    public int mySqrt(int x) {
    double root,divide;
    double num=x;
    root=x/2.0d;
    if(x<=1){
        return x;
    }
    while(checkRoot(root,num)==false){
        divide=x/root;
        root=findAverage(root,divide);
    }
    return (int)root;
    }

    public static void main(String[] args) {
        SquareRoot root=new SquareRoot();
        System.out.println(root.mySqrt(2147395599));
    }
}
