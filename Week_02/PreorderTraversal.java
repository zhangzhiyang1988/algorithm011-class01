package com.zzy.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的 前序 遍历。
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,2,3]
 */
public class PreorderTraversal {
    public static List<Integer> preorderTraversal(InorderTraversal.TreeNode root){
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }
    public static void helper(InorderTraversal.TreeNode root,List<Integer> res){
        if(root==null) return;
        res.add(root.val);
        if (root.left!=null){
            helper(root.left,res);
        }
        if(root.right!=null){
            helper(root.right,res);
        }
    }
}
