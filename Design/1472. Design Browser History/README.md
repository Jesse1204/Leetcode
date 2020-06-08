### 1472. Design Browser History
  
#### 解法：
用一个List和一个指针即可解决。需要注意的是涉及到往中间插元素的时候用LinkedList会比ArrayList更快。  
  
list.subList(start,end).clear() 这个方法可以将start到end这段的元素从List中清空，例子如下：  
  
list = [0,1,2,3,4,5]  
  
list.subList(2,list.size()).clear()之后  
  
list = [0,1]  
  
  
[Leetcode Link](https://leetcode.com/problems/design-browser-history/)