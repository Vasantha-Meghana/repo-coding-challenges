#Majority Element
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums.sort()
        c = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                c += 1
                if c > (len(nums) // 2):
                    return nums[i]
            else:
                c = 1
        return nums[0]
