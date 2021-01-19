package pers.yshy.question112;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author ysy
 * @date 2021/1/19
 * @package pers.yshy.question112
 **/
public class Solution01 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        List<TreeNode> l1 = new ArrayList<>();
        l1.add(root);
        List<TreeNode> l2 = null;
        int count = 0;
        while(count < l1.size()){
            l2 = new ArrayList<>();
            count = 0;
            for(int i=0; i<l1.size(); i++){
                TreeNode tree = l1.get(i);
                if(tree.left != null){
                    tree.left.val += tree.val;
                    l2.add(tree.left);
                }
                if(tree.right != null){
                    tree.right.val += tree.val;
                    l2.add(tree.right);
                }
                if(tree.left == null && tree.right == null){
                    l2.add(tree);
                    if(tree.val == sum){
                        return true;
                    }
                    count++;
                }
            }
            l1 = l2;
        }
        return false;
    }
}
