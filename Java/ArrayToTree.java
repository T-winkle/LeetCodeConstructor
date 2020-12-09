import java.util.*;

/**
 * 记得输入List或Integer[], 因为int[]不能存放null, 所以不支持输入int[]
 */
public class ArrayToTree {
    public static void main(String[] args) {
        ArrayToTree arrayToTree = new ArrayToTree();
        // eg1
        TreeNode root1 = arrayToTree.arrayToTree(Arrays.asList(3,9,20,null,null,15,7));
        // eg2
        TreeNode root2 = arrayToTree.arrayToTree(new Integer[]{3,9,20,null,null,15,7});
    }

    public TreeNode arrayToTree(List<Integer> array){
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode root = new TreeNode(array.get(0));
        int index = 1;
        deque.add(root);
        while (index < array.size() && !deque.isEmpty()){
            TreeNode temp = deque.poll();
            if (array.get(index) != null){
                temp.left = new TreeNode(array.get(index));
                deque.add(temp.left);
            }
            index++;
            if (index < array.size() && array.get(index) != null){
                temp.right = new TreeNode(array.get(index));
                deque.add(temp.right);
            }
            index++;
        }
        return root;
    }

    public TreeNode arrayToTree(Integer[] arr){
        List<Integer> array = Arrays.asList(arr);
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode root = new TreeNode(array.get(0));
        int index = 1;
        deque.add(root);
        while (index < array.size() && !deque.isEmpty()){
            TreeNode temp = deque.poll();
            if (array.get(index) != null){
                temp.left = new TreeNode(array.get(index));
                deque.add(temp.left);
            }
            index++;
            if (index < array.size() && array.get(index) != null){
                temp.right = new TreeNode(array.get(index));
                deque.add(temp.right);
            }
            index++;
        }
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

