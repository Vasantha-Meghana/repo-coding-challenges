#Find Kth Bit in Nth Binary String
class Solution:
    def findKthBit(self, n: int, k: int) -> str:
        s = []
        s.append("0")
        for i in range(1, n):
            temp = ""
            for ch in s[i - 1]:
                if ch == '0':
                    temp += '1'
                else:
                    temp += '0'
            s.append(s[i - 1] + "1" + temp[::-1])
        return s[n - 1][k - 1]
