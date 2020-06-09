### 231. Power of Two
  
#### 解法：
如果是2的幂，二进制表示的话应该是最高位为1，剩下的都是0  
  
例如  
  
1, 10, 100, 1000 ...  
  
可以通过位运算，每次n&1，判断最低位是否为1，然后count计数，最后判断count==1。  
  
更好的方法是，直接比较 n&n-1 是否为0，如图。  


  
[Leetcode Link](https://leetcode.com/problems/power-of-two/)