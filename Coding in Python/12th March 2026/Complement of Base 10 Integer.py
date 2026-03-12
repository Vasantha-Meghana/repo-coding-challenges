#Complement of Base 10 Integer
class Solution:
    def bitwiseComplement(self, n: int) -> int:
        s = bin(n)[2:]
        res = 0
        for ch in s:
            if ch == '0':
                res = (res * 2) + 1
            else:
                res = res * 2
        return res
