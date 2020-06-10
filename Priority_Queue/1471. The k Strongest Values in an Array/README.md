### 1471. The k Strongest Values in an Array
  
#### 解法：
Strong的排序方法为，比较每个元素和中位数差值的绝对值，越大的越Strong。  
  
为求得中位数，首先需要对数组排序。排序之后用一个最小堆的优先队列。需注意比较器的设置，首先比较绝对值差值，如果不相等直接用绝对值差值，如果相等的话用a1-a2。  
  
本题应该有更好解法，排序之后用双指针会更快。  
  
时间复杂度：O(nlogn) 因为第一步进行了排序。使用优先队列的部分是O(nlogk)  

空间复杂度：O(k) PQ的大小  
  
[Leetcode Link](https://leetcode.com/problems/the-k-strongest-values-in-an-array/)