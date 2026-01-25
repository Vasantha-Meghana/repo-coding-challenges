#Minimum Difference Between Highest and Lowest of K Scores
class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        min1 = float('inf')
        nums.sort()
        for i in range(0, len(nums) - k + 1):
            j = i + k - 1
            temp = nums[j] - nums[i]
            if(temp < min1):
                min1 = temp
        return min1
