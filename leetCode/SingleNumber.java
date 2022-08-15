package leetCode;

import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Arrays.stream(nums).sorted();
        Collections.sort(list);
        for(int i=0;i<nums.length;i=i+2){
           if((i+1)==nums.length){
               list.add(i,nums[i]);
               return list.get(i);
           }else{
               list.add(i,nums[i]);
               list.add(i+1,nums[i+1]);
               if(!list.get(i).equals(list.get(i+1))){
                   return list.get(i);
               }
           }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array={4,1,2,1,2};
        SingleNumber number=new SingleNumber();
        System.out.println(number.singleNumber(array));
    }
}
