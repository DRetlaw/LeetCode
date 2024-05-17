/*
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
 * 108. Convert Sorted Array to Binary Search Tree
 */

import javax.swing.tree.TreeNode;

public class Test1205242 {

    public static void main(String[] args) {
        //int x=4;
        int []nums = {-10,-3,0,5,9};
        sortedArrayToBST(nums);
        System.out.println("Done!!!");
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        int l=0, r=nums.length-1; 
        return makeBST(l,r);
    }

    public static TreeNode makeBST(int l, int r) {
        TreeNode root=null;
        int mid=(l+r)/2;
        root=new TreeNode(mid);
        makeBST(l, mid-1);
        makeBST(mid+1, r);
        return root;
    }
}
