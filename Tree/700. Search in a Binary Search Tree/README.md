### 700. Search in a Binary Search Tree
  
#### 解法1 递归：  
递归边界：root为空或者root的值正是我们要找的  
递归对象：左子树和右子树  
  
时间复杂度：O(H) H代表树的高度。所以average case是O(logN)，最坏情况是O(N)  
  
空间复杂度：O(H) 同上  
  
#### 解法2 迭代：

[Leetcode Link](https://leetcode.com/problems/search-in-a-binary-search-tree/)