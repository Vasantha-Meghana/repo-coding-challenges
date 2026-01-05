#Max Consecutive Ones
class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        c = 0
        maxi = 0
        for ele in nums:
            if ele == 1:
                c += 1
            else:
                c = 0
            if c > maxi:
                maxi = c
        return maxi
