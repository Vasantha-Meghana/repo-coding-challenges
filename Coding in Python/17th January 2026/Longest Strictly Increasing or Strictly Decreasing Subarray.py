#Longest Strictly Increasing or Strictly Decreasing Subarray
class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        res = count = 0
        prev = nums[0]
        op, other = operator.lt, operator.gt
        for i in nums:
            if op(i, prev):
                count += 1
            else:
                res = max(res, count)
                op, other = other, op
                count = 1 if i == prev else 2
            prev = i
        return max(res, count)
