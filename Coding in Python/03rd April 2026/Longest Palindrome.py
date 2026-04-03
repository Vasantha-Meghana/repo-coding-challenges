#Longest Palindrome
class Solution:
    def longestPalindrome(self, s: str) -> int:
        odd = 0
        map = {}
        for ch in s:
            if ch in map:
                map[ch] += 1
            else:
                map[ch] = 1
            if map[ch] % 2 == 0:
                odd -= 1
            else:
                odd += 1
        if odd > 1:
            return len(s) - odd + 1
        return len(s)
