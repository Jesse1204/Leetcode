### 222. Count Complete Tree Nodes  
  
#### 解法1 递归：  
直接递归就可以解决。边界条件是root==null，递归语句执行对象是root.left和root.right，返回值是  
  
1+countNodes(root.left)+countNodes(root.right) 

然而这种解法没有利用题目的条件，即这棵树是一棵完全二叉树，因此不是最优解。   
  
时间复杂度：O(N)
  
空间复杂度：O(d) = O(logN)，d为树的深度  
  
#### 解法2 二分查找：
  
时间复杂度：O(N)
  
空间复杂度：O(d) = O(logN)，d为树的深度  

[Leetcode Link](https://leetcode.com/problems/count-complete-tree-nodes/)