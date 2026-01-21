#Find Pivot Index
class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        lsum = 0
        tsum = 0
        for i in range(0, len(nums)):
            tsum += nums[i]
        for i in range(0, len(nums)):
            tsum -= nums[i]
            if(tsum == lsum):
                return i
            lsum += nums[i]
        return -1
