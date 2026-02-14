#Divide Array Into Equal Pairs
class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        dict1 = {}
        for ele in nums:
            if ele in dict1:
                dict1[ele] += 1
            else:
                dict1[ele] = 1
        for k in dict1:
            if dict1[k] % 2 != 0:
                return False
        return True
