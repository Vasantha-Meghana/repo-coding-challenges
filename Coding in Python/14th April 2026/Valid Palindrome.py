#Valid Palindrome
class Solution:
    def isPalindrome(self, s: str) -> bool:
        i = 0
        j = len(s) - 1
        while i <= j:
            if not s[i].isalnum(): 
                i += 1
            elif not s[j].isalnum():
                j -= 1
            else:
                ch1 = s[i].lower()
                ch2 = s[j].lower()
                if(ch1 != ch2):
                    return False
                i += 1
                j -= 1
        return True
