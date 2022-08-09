package leetCode;

public class maximumSubarray {
    public int maxSubArray(int[] nums) {
        int current=0,finalSum=nums[0];
        int start=0,end=0;
        for(;end<nums.length;end++){
            if(nums[end]>nums[start]){
                start++;
            }
            for(int i=start;i<=end;i++){
                current=current+nums[i];
            }
            if(current>=finalSum){
                finalSum=current;
            }
            current=0;
        }
        return finalSum;
    }

    public static void main(String[] args) {
        int[] nums={5,4,-1,7,8};
        maximumSubarray subarray=new maximumSubarray();
        System.out.println(subarray.maxSubArray(nums));
    }
}
