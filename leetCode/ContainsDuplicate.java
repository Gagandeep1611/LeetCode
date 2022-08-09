package leetCode;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() < nums.length;
    }
//    public boolean containsDuplicate(int[] nums) {
//        if(nums.length==1){
//            return false;
//        }
//        for(int i=0;i< nums.length-1;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]==nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate(nums));
    }
}
