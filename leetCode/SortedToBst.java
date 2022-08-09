package leetCode;

public class SortedToBst {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }else{
         TreeNode head=helper(0,nums.length-1,nums);
         return head;
        }
    }
    public TreeNode helper(int l,int r,int[]nums){
        if(l>r){
            return null;
        }
        int mid=(l+r)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=helper(l,mid-1,nums);
        node.right=helper(mid+1,r,nums);
        return node;

    }

    public static void main(String[] args) {
        SortedToBst stb=new SortedToBst();
        int[] nums={1,3};
        stb.sortedArrayToBST(nums);
    }
}
