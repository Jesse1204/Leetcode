### 96. Unique Binary Search Trees  
  
#### 解法1 动态规划：  
想象一下我们是如何构造一个从1到n的二叉查找树。我们从中取一个数字i作为根节点，那么1到i-1就构成左子树，i+1到n构成右子树。如下图。  
![96](https://github.com/Jesse1204/Leetcode/blob/master/Images/96.png)  
  
在构建二叉平衡树的过程中，我们可以发现这个问题可以由一个个子问题来构成。1到n以i为根节点，那么构建左右子树的话又会是一个子问题。所以递归肯定是可以做的。  
  
我们现在以F(n,i)表示，构建一棵从1到n的以i为结点的二叉查找树。以dp[n]表示我们要求的问题，从1到n总共有多少棵二叉查找树。那么很容易看出  
  
$ F(n,i) = dp[i-1] \cdot dp[n-i]  $
  
左子树总共有dp[i-1]种可能，右子树总共有dp[n-i]种可能，总共的可能性就是他们的乘积。也可以看出：  
  
$ dp[n] = \sum_{i=1}^{n} F(n,i) =  \sum_{i=1}^{n}dp[i-1] \cdot dp[n-i] $  
  
初始化：dp[0] = 1, dp[1] = 1  
  
最后返回dp[n]即可

  
时间复杂度：$O(n^2)$

空间复杂度：$O(1)$  

#### 解法2 递归：
思路基本同上。递归终止条件为start>=end，递归执行left = helper(start,i-1)和right = helper(i+1,end)。  

时间复杂度：$ O(N \cdot N!) $ 画出递归树可以看出来。

```
                               G(4)
                     /      |        |        \
             G(0)G(3)     G(1)G(2)  G(2)G(1)   G(3)G(0)        // 4
            /    |    \
    G(0)G(2)  G(1)G(1)  G(2)G(0)                               // 4 x 3
    /     \
G(0)G(1)  G(1)G(0) // base case                                // 4 x 3 x 2

```  
空间复杂度：O(N)  
  
#### 解法3 带备忘录的递归：  
思路基本同递归解法，用一个memo来记录算过的G，可以有效降低时间复杂度，和动态规划一样。
  
时间复杂度：$O(n^2)$  

空间复杂度：$O(1)$  
  
[Leetcode Link](https://leetcode.com/problems/unique-binary-search-trees/)
[Leetcode Article](https://leetcode.com/articles/unique-binary-search-trees/)