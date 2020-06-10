### 528. Random Pick with Weight
  
#### 解法：
这道题还是挺难的，首先理解上就有难度，看了很久题才明白什么意思，然后看了很久别人的解法才明白。  

这道题大概意思是，例如给一个如下数组：  
  
[1,2,3,4]  
  
那么返回index 0的概率应该是1/1+2+3+4 = 1/10，返回index 1的概率应该是1/5，index2的概率是3/10，index 4的概率是2/5。  
  
如何做到上述操作，需要把概率分布函数转换为累计概率分布函数，也就是prefix sum。得到一个prefix sum的数组，对于上述例子也就是  
  
[1,3,6,10]  
  
然后生成一个在[1,10]之间的随机数，最后看这个数落在哪个区间，对于上述例子，区间应该是：  
  
[1],[2,3],[4,5,6],[7,8,9,10]  
  
接下来应该用二分查找，和 [Leetcode 35. Search Insert Position](https://leetcode.com/problems/search-insert-position/) 一样。二分查找虽然练了很多遍，但是总是忘，需要再好好复习巩固。  
  
时间复杂度：第一个函数是O(n) 因为需要遍历整个w数组来构建prefix sum数组。第二个函数pinkIndex：二分查找时间复杂度O(logn)，如果不用二分查找用线性查找，这部分时间复杂度会是O(n)。  
  
空间复杂度：第一个函数是O(n)，因为用了额外数组来存储prefix sum。第二个函数是O(1)。
[Leetcode Link](https://leetcode.com/problems/random-pick-with-weight/)