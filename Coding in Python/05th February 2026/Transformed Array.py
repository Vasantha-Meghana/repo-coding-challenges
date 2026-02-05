#Transformed Array
class Solution:
    def constructTransformedArray(self, nums: List[int]) -> List[int]:
        res = [0] * len(nums)
        for i in range(len(nums)):
            if nums[i] > 0:
                ind = (i + nums[i]) % len(nums)
            else:
                ind = (i - abs(nums[i])) % len(nums)
                if ind < 0:
                    ind += len(nums)
            res[i] = nums[ind]
        return res
