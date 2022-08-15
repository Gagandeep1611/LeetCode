package leetCode;

import java.util.ArrayList;
import java.util.List;

public class preOrderTraversal {
    List<Integer> list=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {

        if(root==null){
            return list;
        }
        else{
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
