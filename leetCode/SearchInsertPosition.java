package leetCode;

public class SearchInsertPosition {
    //    public int searchInsert(int[] nums, int target) {
//        int i = 0;
//        while (i<nums.length) {
//            if (nums[i] < target) {
//                i++;
//            } else if (nums[i] > target) {
//                int[] newnums = new int[nums.length + 1];
//                newnums[i] = target;
//                for (int j = 0; j < i; j++) {
//                    newnums[j] = nums[j];
//                }
//                for (int j = i + 1; j < newnums.length; j++) {
//                    newnums[j]=nums[j-1];
//                }
//                return i;
//            } else {
//                return i;
//            }
//        }
//            return i;
//
//    }
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length,middle;
        while(true){
                middle = (left + right) / 2;
                if (nums[middle] == target) {
                    return middle;
                } else if (nums[middle] > target) {
                    right = middle;
                } else if (nums[middle] < target) {
                    left = middle;
                }
                if(left==middle){
                    int[] newnums=new int[nums.length+1];
                    if(nums[middle]>target){
                        newnums[middle]=target;
                        for(int i=0;i<middle;i++){
                            newnums[i]=nums[i];
                        }
                        for(int i=middle+1;i< newnums.length;i++){
                            newnums[i]=nums[i-1];
                        }
                        return middle;
                    }else if(nums[middle]<target){
                        newnums[middle+1]=target;
                        for(int i=0;i<middle+1;i++){
                            newnums[i]=nums[i];
                        }
                        for(int i=middle+2;i< newnums.length;i++){
                            newnums[i]=nums[i-1];
                        }
                        return middle+1;
                    }
                }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        SearchInsertPosition insertPosition = new SearchInsertPosition();
        System.out.println(insertPosition.searchInsert(nums,7));
    }
}
