package leetCode;

public class RemoveDuplicates {
    public int removeElement(int[] nums, int val) {
        int current=0,i=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[current]=nums[i];
                current++;
                i++;
            }else{
                i++;

            }
        }
        return current;
    }
    public void displayArray(int[] array){
        System.out.print("[");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] array={0,1,2,2,3,0,4,2};
        RemoveDuplicates removeDuplicates=new RemoveDuplicates();
        System.out.println(removeDuplicates.removeElement(array,2));
        removeDuplicates.displayArray(array);

    }
}
