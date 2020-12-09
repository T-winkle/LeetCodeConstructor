# **LeetCodeConstructor**
[English](./README.md) | 中文

&emsp;&emsp;完成一道LeetCode题目时或者提交后有部分用例未通过测试，这时候我们没有办法调试。这个仓库的目的是创建一些LeetCode上数据结构的构建器以方便使用本地环境调试。例如LeetCode将二叉树表示一个一维数组，使用这个仓库的二叉树构建器可以直接将数组转换为二叉树的很节点。可配合各个开发环境的LeetCode插件使用。
## **使用**
- [JavaScript](./javaScript/BTreeUsage.js)
  ```javascript
  // use relative path to import
  let BTree = require("javaScript/BTree");
  let root = new BTree([1,2,3,4,null,null,5]);

  // call the solution function of your problems to debug locally
  solution(root);
  ```
## **待办**
 - Binary Tree Constructor
    - [ ] C/C++
    - [ ] Java
    - [x] JavaScript
    - [ ] Python