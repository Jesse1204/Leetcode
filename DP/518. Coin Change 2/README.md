### 518. Coin Change 2  
  
#### 解法：
题目的意思是给定一个coin的数组，用里面的硬币刚好凑成amount。很典型的DP题目，用一维DP就可以了。从题目给的例子中得到的启发。 
   
amount = 5, coins = [1, 2, 5]  
  
总共有4种方法凑成5:  
  
5=5  
5=2+2+1  
5=2+1+1+1  
5=1+1+1+1+1  
  
假设当前要凑到i，总共有1，2，5三种硬币。  

那么dp[i] = dp[i-1] + dp[i-2] + dp[i-5]  
  
所以状态转移方程应该是：  
dp[i] += dp[i-coin]  
  
初始状态应该是dp[0] = 1，要凑成0只有一种方法就是不放硬币。  
  
[Leetcode Link](https://leetcode.com/problems/coin-change-2/)