#Longest Common Prefix
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()
        shortest = strs[0]
        longest = strs[-1]
        res = ""
        for i in range(len(shortest)):
            if shortest[i] == longest[i]:
                res += shortest[i]
            else:
                break
        return res
        '''
        i = 0
        for i in range(len(shortest)):
            if(shortest[i] != longest[i]):
                return shortest[0 : i]
        return shortest
        '''
