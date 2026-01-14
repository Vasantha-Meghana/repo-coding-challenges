#Maximum Difference Between Even and Odd Frequency 1
class Solution:
    def maxDifference(self, s: str) -> int:
        d = {}
        mo = float('-inf')
        me = float('inf')
        for i in range(len(s)):
            if s[i] in d:
                d[s[i]] = d.get(s[i]) + 1
            else:
                d[s[i]] = 1
        for val in d.values():
            if val % 2 != 0:
                mo = max(mo, val)
            else:
                me = min(me, val)
        if mo == float('-inf') or me == float('inf'):
            return -1
        return mo - me
