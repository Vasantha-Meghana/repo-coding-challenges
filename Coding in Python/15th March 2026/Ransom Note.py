#Ransom Note
class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        dict1 = {}
        for ch in magazine:
            if ch in dict1:
                dict1[ch] += 1
            else:
                dict1[ch] = 1
        for ch in ransomNote:
            if ch not in dict1 or dict1[ch] <= 0:
                return False
            dict1[ch] -= 1
        return True
