package leetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class ClimbingStairs {
    //        public int factorialOf(int x){
//        int factorial=x;
//        if(x==0){
//            return 1;
//        }else {
//            for (int i = 1; i < x; i++) {
//                factorial = factorial*i;
//            }
//        }
//            return factorial;
//    }
//
//    public int permutationsOf(int ones,int twos){
//        return (factorialOf(ones+twos))/((factorialOf(ones))*factorialOf(twos));
//    }
//
//    public int climbStairs(int n) {
//        int ones, twos,count=0;
//        for(twos=0;twos<=n/2;twos++){
//            ones=n-2*(twos);
//            count=count+permutationsOf(ones,twos);
//        }
//        return count;
//
//    }
//    int[] mem=new int[46];
    HashMap<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if (n == 1) {
            return n;
        } else if (n == 2) {
            return n;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        map.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return map.get(n);
    }

    public static void main(String[] args) {
        ClimbingStairs stairs = new ClimbingStairs();
        System.out.println(stairs.climbStairs(45));
    }
}
