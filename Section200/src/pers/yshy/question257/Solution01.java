package pers.yshy.question257;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归，遇到子节点再往回走
 *
 * 执行用时：10 ms, 在所有 Java 提交中击败了45.83%的用户
 * 内存消耗：39 MB, 在所有 Java 提交中击败了5.13%的用户
 *
 * @author ysy
 * @date 2021/2/3
 * @package pers.yshy.question257
 **/
public class Solution01 {
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<StringBuilder> str = recursion(root);
        str.forEach(item ->{
            res.add(item.reverse().toString());
        });
        return res;
    }

    private List<StringBuilder> recursion(TreeNode root){
        if(root == null){
            return null;
        }
        List<StringBuilder> res = new ArrayList<>();
        if(root.left == null && root.right == null){
            StringBuilder str = new StringBuilder(root.val+"");
            res.add(str);
            return res;
        }
        List<StringBuilder> left = recursion(root.left);
        List<StringBuilder> right = recursion(root.right);
        if(left != null){
            for(StringBuilder s : left){
                s.insert(0, "->"+root.val);
            }
            res.addAll(left);
        }
        if(right != null){
            for(StringBuilder s : right){
                s.insert(0, "->"+root.val);
            }
            res.addAll(right);
        }
        return res;
    }
}
