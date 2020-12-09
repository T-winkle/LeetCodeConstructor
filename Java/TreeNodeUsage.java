import java.util.Arrays;

public class TreeNodeUsage {
    public static void main(String[] args) {
        // 数组转二叉树
        TreeNode root1 = new TreeNode(new Integer[]{3,9,15,null,null,7,8});
        TreeNode root2 = new TreeNode(Arrays.asList(3,9,15,null,null,7,8));
        preOrder(root1);
    }

    public static void preOrder(TreeNode node){
        if (node == null) return;
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
}
