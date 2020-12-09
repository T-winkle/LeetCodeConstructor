import java.util.*;

/**
 * 记得输入List或Integer[], 因为int[]不能存放null, 所以不支持输入int[]
 */

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(Integer[] arr){
        List<Integer> array = Arrays.asList(arr);
        Deque<TreeNode> deque = new ArrayDeque<>();
        this.val = array.get(0);
        int index = 1;
        deque.add(this);
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
    }

    public TreeNode(List<Integer> array){
        Deque<TreeNode> deque = new ArrayDeque<>();
        this.val = array.get(0);
        int index = 1;
        deque.add(this);
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
    }
}

