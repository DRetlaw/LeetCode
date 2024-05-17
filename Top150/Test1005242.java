/*
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 * 94. Binary Tree Inorder Traversal
 */

import java.util.List;

import javax.swing.tree.TreeNode;

public class Test1005242 {

    public static void main(String[] args) {
        //String a = "11", b = "1";
        //String a = "1010", b = "1011";
        //String a = "1", b = "111";
        //SOLVED directly on website
        //System.out.println(inorderTraversal(root));
        System.out.println("Done!!!");
    }

    public void inorderTraversal(TreeNode root,List lst) {
        if(root==null)
            return;
        inorderTraversal(root.left,lst);
        lst.add(root.val);
        inorderTraversal(root.right,lst);
    }
}
