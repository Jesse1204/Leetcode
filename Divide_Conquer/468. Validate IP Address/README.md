### 468. Validate IP Address  
  
#### 解法1 Java/Python 内置函数：
  
Java和Python内置了验证IP地址的函数，直接调用即可。如果IPv4和IPv6都无法匹配上，直接抛出异常return "Neither". 然而这道题中的要求和真实的IP地址不同，这道题要求每一位不能以0开头，例如01.01.01.01是不行的，然而现实世界中这个IP地址等同于1.1.1.1。
  
时间复杂度：O(1)  

空间复杂度：O(1)  
  
#### 解法2 正则表达式：  
正则表达式需要多加练习。  
[学习地址](https://github.com/ziishaned/learn-regex/blob/master/translations/README-cn.md)  
  
时间复杂度：O(1)  

空间复杂度：O(1)  
  
#### 解法3 分治：  
见下图：  
![https://github.com/Jesse1204/Leetcode/blob/master/Images/468.png](https://github.com/Jesse1204/Leetcode/blob/master/Images/468.png)
  
时间复杂度：O(n)，知道有多少个点需要parse整个string一次  

空间复杂度：O(1)  
  
[Leetcode Link](https://leetcode.com/problems/validate-ip-address/)
[Leetcode Article](https://leetcode.com/articles/validate-ip-address/)