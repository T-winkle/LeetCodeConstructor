/*
 * @lc app=leetcode.cn id=94 lang=javascript
 *
 * [94] 二叉树的中序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var inorderTraversal = function(root) {
  if (!root) return ;
  let res = [];
  let traversal = (root) => {
    root.left && traversal(root.left);
    res.push(root.val);
    root.right && traversal(root.right);
  }
  traversal(root);
  return res;
};
// @lc code=end

// Usage
let BTree = require("./BTree");
let root = new BTree([1,2,3,4,null,null,5]);
inorderTraversal(root);


