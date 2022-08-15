package leetCode;


public class MissingNumber {
    public int findMissing(int[] nums){
        int sum=0;
        int newSum=0;
        int i;
        for(i=0;i<nums.length;i++){
            sum=sum+i;
            newSum=newSum+nums[i];
        }
        sum=sum+i;
        return sum-newSum;
    }
    public static void main(String[] args) {
        int[] array={3,0,1};
        MissingNumber find=new MissingNumber();
        System.out.println(find.findMissing(array));
    }
}
