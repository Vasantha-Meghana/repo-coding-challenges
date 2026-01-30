#Find Missing and Repeated Values
class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        res = []
        set1 = set()
        for arr in grid:
            for ele in arr:
                if ele in set1:
                    res.append(ele)
                set1.add(ele)
        for i in range(1, len(grid) * len(grid) + 1):
            if i not in set1:
                res.append(i)
        return res
        
