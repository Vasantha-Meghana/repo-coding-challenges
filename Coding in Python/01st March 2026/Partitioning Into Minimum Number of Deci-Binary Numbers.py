#Partitioning Into Minimum Number of Deci-Binary Numbers
class Solution:
    def minPartitions(self, n: str) -> int:
        result = float('-inf')
        for ch in n:
            i = int(ch)
            if i > result:
                result = i
        return result
