### 1481. Least Number of Unique Integers after K Removals (Contest 193 Q1)
  
#### 解法1（我的解法）：
使用一个HashMap统计每个数字在数组中出现的次数，并且用一个变量size统计总共有多少个数字。接下来用Lambda表达式根据出现次数从小到大排序这个map（Lambda表达式需要好好学一下，很有用），输出一个有序的LinkedHashmap。  
然后遍历这个有序的Map，k每次减去当前entry出现的次数，直到为0或者小于entry.getValue()。每删除一个数字count就+1，最后return size-count。
  
时间复杂度：O(nlogn)  
  
空间复杂度：O(n) 
  
#### 解法2（Binary Search）：
  
[Leetcode Link](https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/)