#Valid Anagram
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        '''
        s = "".join(sorted(s))
        t = "".join(sorted(t))
        return s == t
        '''
        if len(s) != len(t):  
            return False
        arr = [0] * 26
        for i in range(len(s)):
            arr[ord(s[i]) - 97] += 1
            arr[ord(t[i]) - 97] -= 1
        for i in range(26):
            if arr[i] != 0:
                return False
        return True
