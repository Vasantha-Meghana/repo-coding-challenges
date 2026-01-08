#Group Anagrams
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = []
        d = dict()
        for s in strs:
            st = ''.join(sorted(s))
            if(st not in d):
                d[st] = []
            d[st].append(s)
        for k in d:
            result.append(d[k])
        return result
