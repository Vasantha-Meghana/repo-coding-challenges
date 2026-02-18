#Binary Number with Alternating Bits
class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        s = []
        while n > 0:
            r = n % 2
            n = n // 2
            s.append(r)
        for i in range(1, len(s)):
            if(s[i - 1] == s[i]):
                return False
        return True
