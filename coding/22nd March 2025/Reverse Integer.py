#Reverse Integer
class Solution:
    def reverse(self, x: int) -> int:
        n = abs(x)
        s = str(n)
        rev = ""
        for ch in s:
            rev = ch + rev
        res = int(rev)
        if x < 0 :  
            res = -res
        if 2147483648 > res > -2147483649:
            return res 
        return 0
