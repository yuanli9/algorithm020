import javax.swing.tree.TreeNode;
import java.util.Arrays;

public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //递归结束判断
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        //每个子树根节点
        TreeNode root = new TreeNode(preorder[0]);

        //遍历查找子数
        for (int i = 0; i < preorder.length; ++i) {
            if (preorder[0] == inorder[i]) {
                int[] preorderLeft = Arrays.copyOfRange(preorder, 1, i+1);
                int[] preorderRigt = Arrays.copyOfRange(preorder, i+1, preorder.length);
                int[] inorderLeft = Arrays.copyOfRange(inorder, 0, i);
                int[] inorderRigt = Arrays.copyOfRange(inorder, i + 1, inorder.length);
                root.left = buildTree(preorderLeft, inorderLeft);
                root.right = buildTree(preorderRigt, inorderRigt);
                break;
            }
        }
        return root;
    }
}
