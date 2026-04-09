#Largest Substring Between Two Equal Characters
class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        maxi = -1
        dict1 = {}
        for i, ch in enumerate(s):
            if ch in dict1:
                maxi = max(i - dict1[ch] - 1, maxi)
            else:
                dict1[ch] = i
        return maxi
