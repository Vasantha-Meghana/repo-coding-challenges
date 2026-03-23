#Maximum Product Difference Between Two Pairs
class Solution:
    def maxProductDifference(self, nums: List[int]) -> int:
        nums.sort()
        prod1 = nums[-1] * nums[-2]
        prod2 = nums[0] * nums[1]
        return prod1 - prod2
