#N-Repeated Element in Size 2N Array
class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        s = set()
        for ele in nums:
            if ele in s:
                return ele
            s.add(ele)
        return -1
