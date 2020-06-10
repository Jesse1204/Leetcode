### 392. Is Subsequence
  
#### 解法：
双指针，第一个指针在string s，第二个指针在string t。初始化时两个指针都为0，循环终止条件为left和right越界。如果s[left]==s[right]，两个指针都移动，不然的话只移动right，在t里面接着找。最后假如left没有越界，说明s不是每一个字符都能按顺序地在t中找到，return false，不然的话return true。  
  
这题还可以看作是 [Edit Distance](https://leetcode.com/problems/edit-distance/) 的简化版。Edit Distance中有增加，删除，替换三种操作，这题可以看作只有删除这一种操作。具体解法还没想明白，后面更新。  
  
时间复杂度：O(|T|)  
  
空间复杂度：O(1)  

[Leetcode Link](https://leetcode.com/problems/shuffle-the-array)