#Trionic Array 1
class Solution:
    def isTrionic(self, nums: List[int]) -> bool:
        if(len(nums) <= 3):
            return False
        p = 0
        q = 0
        k = 0
        for i in range(1, len(nums)):
            if(nums[i - 1] >= nums[i]):
                p = i - 1
                break
            p = i
        for i in range(p + 1, len(nums)):
            if(nums[i - 1] <= nums[i]):
                q = i - 1
                break
            q = i
        for i in range(q + 1, len(nums)):
            if(nums[i - 1] >= nums[i]):
                k = i - 1
                break
            k = i
        return p > 0 and q > p and k == len(nums) - 1
