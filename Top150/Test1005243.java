/*
 * https://leetcode.com/problems/same-tree/description/
 * 100. Same Tree
 */

import javax.swing.tree.TreeNode;

public class Test1005243 {

    public static void main(String[] args) {
        //String a = "11", b = "1";
        //String a = "1010", b = "1011";
        //String a = "1", b = "111";
        //SOLVED directly on website
        //System.out.println(inorderTraversal(root));
        System.out.println("Done!!!");
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        if(p.val!=q.val)
            return false;

        return (isSameTree(p.left, q.left)&&isSameTree(p.right,q.right));
        
    }
}
