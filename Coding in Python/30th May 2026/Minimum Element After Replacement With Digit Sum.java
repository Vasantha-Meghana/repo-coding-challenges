#Minimum Element After Replacement With Digit Sum
class Solution:
    def minElement(self, nums: List[int]) -> int:
        min1 = math.inf
        for ele in nums:
            sum1 = 0
            while ele > 0:
                sum1 += ele % 10
                ele //= 10
            if sum1 < min1:
                min1 = sum1
        return min1
