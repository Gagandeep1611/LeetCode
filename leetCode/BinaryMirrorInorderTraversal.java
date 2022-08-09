package leetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryMirrorInorderTraversal {
    List<Integer> list=new ArrayList<>();
    public List<Integer> MirrorInorderTraversal(TreeNode root) {

        if(root==null){
            return list;
        }
        else{
            MirrorInorderTraversal(root.right);
            list.add(root.val);
            MirrorInorderTraversal(root.left);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
