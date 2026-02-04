#Word Pattern
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map1 = {}
        used = set()
        arr = s.split(' ')
        if(len(pattern) != len(arr)):
            return False
        for i in range(0, len(arr)):
            ch = pattern[i]
            if ch in map1:
                if map1.get(ch) != arr[i]:
                    return False
            else:
                if arr[i] in used:
                    return False
                used.add(arr[i])
                map1[ch] = arr[i]
        return True
