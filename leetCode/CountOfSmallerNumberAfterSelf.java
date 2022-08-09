package leetCode;

import java.util.ArrayList;
import java.util.List;

public class CountOfSmallerNumberAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> countarray=new ArrayList<>();
        int count;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            countarray.add(count);
        }
        return countarray;
    }

    public static void main(String[] args) {
        int[] nums={5,2,6,1};
        List<Integer> integerList=new ArrayList<>();
        CountOfSmallerNumberAfterSelf count=new CountOfSmallerNumberAfterSelf();
        integerList=count.countSmaller(nums);
        System.out.println(integerList.size());
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
    }
}
