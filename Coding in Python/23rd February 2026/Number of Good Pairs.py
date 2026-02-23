#Number of Good Pairs
class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        dict1 = {}
        result = 0
        for ele in nums:
            if ele in dict1:
                dict1[ele] += 1
            else:
                dict1[ele] = 1
        for k in dict1:
            v = dict1[k]
            result += (v * (v - 1)) // 2
        return result
