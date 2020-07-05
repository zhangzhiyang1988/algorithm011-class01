package com.zzy.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,3,2]
 */
public class InorderTraversal {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    public static void helper(TreeNode root,List<Integer> res){
        if(root==null) return;
       if(root.left!=null){
           helper(root.left,res);
       }
       res.add(root.val);
       if(root.right!=null){
          helper(root.right,res);
       }
    }
}
