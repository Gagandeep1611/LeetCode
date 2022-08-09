package leetCode;

public class removeDuplicatesFromSortedArrays {
    public int removeDuplicates(int[] nums) {
        int current=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[current]=nums[i];
                current++;
            }
            if(i+1 == nums.length-1){
                nums[current]=nums[nums.length-1];
            }
        }
        return current+1;
    }



    public void displayArray(int[] array){
        System.out.print("[");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] array={1,1,2,2,2,3,4,5,6,7,7,8};
        removeDuplicatesFromSortedArrays rd=new removeDuplicatesFromSortedArrays();
        rd.displayArray(array);
        System.out.println(rd.removeDuplicates(array));
        rd.displayArray(array);
    }
}
