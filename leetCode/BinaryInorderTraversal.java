package leetCode;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryInorderTraversal {
    List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {

        if(root==null){
            return list;
        }
        else{
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
