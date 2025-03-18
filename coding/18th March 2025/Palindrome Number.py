#Palindrome Number
class Solution:
    def isPalindrome(self, n: int) -> bool:
        if n < 0:
            return False
        res = 0
        n1 = n
        while n > 0:
            res = res * 10 + n % 10
            n = n // 10
        return res == n1
