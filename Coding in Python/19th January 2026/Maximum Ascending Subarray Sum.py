#Maximum Ascending Subarray Sum
class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        sum1 = nums[0]
        max1 = sum1
        for i in range(1, len(nums)):
            if nums[i] > nums[i - 1]:
                sum1 += nums[i]
            else:
                sum1 = nums[i]
            if max1 < sum1:
                max1 = sum1
        return max1
