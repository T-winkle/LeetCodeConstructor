# **LeetCodeConstructor**
English | [中文](./README-CN.md)

When completing a LeetCode problem or after submission there are some use cases that do not pass the test and we have no way to debug the code. The purpose of this repository is to create some constructors for data structures on LeetCode to facilitate debugging using the local environment. For example LeetCode represents a binary tree as a one dimensional array, using the repository's binary tree constructor, the array can be directly converted to a binary tree. This can be used with the LeetCode plug-in for each development environment.

## **Usage**
- [JavaScript](./javaScript/BTreeUsage.js)
  ```javascript
  // use relative path to import
  let BTree = require("javaScript/BTree");
  let root = new BTree([1,2,3,4,null,null,5]);

  // call the solution function of your problems to debug locally
  solution(root);
  ```
## **TODO**
 - Binary Tree Constructor
    - [ ] C/C++
    - [ ] Java
    - [x] JavaScript
    - [ ] Python