#Construct the Minimum Bitwise Array 1
class Solution:
    def minBitwiseArray(self, nums: List[int]) -> List[int]:
        ans = [0] * len(nums)
        for i in range(0, len(nums)):
            n = nums[i]
            if n != 2:
                ans[i] = int(n - ((n + 1) & (-n - 1)) / 2)
            else:
                ans[i] = (-1)
        return ans
