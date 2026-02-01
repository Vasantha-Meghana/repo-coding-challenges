#Divide an Array Into Subarrays With Minimum Cost 1
class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        min1 = float('inf')
        min2 = float('inf')
        for i in range(1, len(nums)):
            ele = nums[i]
            if ele < min1:
                min2 = min1
                min1 = ele
            elif ele < min2:
                min2 = ele
        return nums[0] + min1 + min2
