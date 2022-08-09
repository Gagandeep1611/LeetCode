package leetCode;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int[] toReturn = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr ={2,7,11,15};
        int[] result;
        TwoSum twoSum =new TwoSum();
        result= twoSum.twoSum(arr,9);
        for (int j : result) System.out.println(j + " ");
    }
}