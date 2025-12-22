#Score of a String
class Solution:
    def scoreOfString(self, s: str) -> int:
        result = 0
        for i in range(len(s) - 1):
            temp = abs(ord(s[i + 1]) - ord(s[i]))
            result += temp
        return result
