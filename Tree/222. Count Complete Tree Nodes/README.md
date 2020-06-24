### 222. Count Complete Tree Nodes  
  
#### 解法1 递归：  
直接递归就可以解决。边界条件是root==null，递归语句执行对象是root.left和root.right，返回值是  
  
1+countNodes(root.left)+countNodes(root.right) 

然而这种解法没有利用题目的条件，即这棵树是一棵完全二叉树，因此不是最优解。   
  
时间复杂度：O(N)
  
空间复杂度：O(d) = O(logN)，d为树的深度  
  
#### 解法2 二分查找：
根据完全二叉树的定义，除了最后一层之外，每一层都是满的。如下图所示。  
![222-1](https://github.com/Jesse1204/Leetcode/blob/master/Images/222-1.png)  
  
所以假如我们知道这棵树的深度d之后，结点的数量就等于2^d - 1 + last_level_nodes  
  
由于最后一层的结点都是往左排的，中间不会出现空的结点。所以可以用以下的思路去想：  
  
1. 假如有一个可以检查是否存在的API，我们该如何使用这个API，对最后一层的哪一些结点进行检查。  
2. 应该如何设计这个检查是否存在的API。  
  
对于第一个问题，因为最后一层结点都是往左靠的，所以不用每一个结点都去试，只要定好mid然后不断收缩就行了。要查找的结点数量为，log(2^d) = d 个。如下图所示。  
![222-2](https://github.com/Jesse1204/Leetcode/blob/master/Images/222-2.png)  
  
对于第二个问题，非常巧妙的是，我们也可以用二分查找来实现这个API。如下图所示，idx为0到3的结点都在root.left下面，而4到7的结点都在root.right下面。以此类推，我们从root出发，如果要查找的结点在mid的右边，那么就往右子树走；如果在mid的左边，就往左子树走，直到最后一层为止。  
![222-3](https://github.com/Jesse1204/Leetcode/blob/master/Images/222-3.png)  
  
逻辑：  
1. 检查root是否为null，如果是的话return 0。时间：O(1)  
2. 遍历这棵树，求出深度d。时间：O(d) = O(logN)  
3. 二分查找检查最后一层的node是否存在。总共最多检查d个node，每个node检查是否存在的时间为O(d)，所以总共的时间复杂度：O(d^2)  
   
时间复杂度：O(d^2) = O((logN)^2)
  
空间复杂度：O(1)

[Leetcode Link](https://leetcode.com/problems/count-complete-tree-nodes/)  
[Leetcode Article](https://leetcode.com/articles/count-complete-tree-nodes/)