function BTree(arr) {
  function BTreeNode(val) {
    this.val = val;
    this.left = this.right = null;
  }
  if (!arr.length) return null;
  let _root = new BTreeNode(arr[0])
  let construct = (root, num) => {
    let leftNum  = 2 * num + 1,
        rightNum = 2 * num + 2;
    if (leftNum < arr.length && arr[leftNum]) {
      root.left = new BTreeNode(arr[leftNum]);
      construct(root.left, leftNum);
    }
    if (rightNum < arr.length && arr[rightNum]) {
      root.right = new BTreeNode(arr[rightNum]);
      construct(root.right, rightNum);
    }
  }
  construct(_root, 0);
  return _root;
}

module.exports = BTree;
