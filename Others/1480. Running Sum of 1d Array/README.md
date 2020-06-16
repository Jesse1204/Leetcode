### 1480. Running Sum of 1d Array (Contest 193 Q1)
  
#### 解法：
直接遍历原数组，求prefix sum并放入新数组即可。如果不考虑是否改变原来的数组，可以直接在原数组进行prefix。  
  
时间复杂度：O(n)  
  
空间复杂度：O(n) / O(1)  
  
[Leetcode Link](https://leetcode.com/problems/running-sum-of-1d-array/)