#Find All Numbers Disappeared in an Array
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        res = []
        s = set()
        for ele in nums:
            s.add(ele)
        for i in range(1, len(nums) + 1):
            if i not in s:
                res.append(i)
        return res
