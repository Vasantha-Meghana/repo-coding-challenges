#Count the Number of Consistent Strings
class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        result = 0
        for s in words:
            c = 0
            for ch in s:
                if ch in allowed:
                    c += 1
            if c == len(s):
                result += 1
        return result
