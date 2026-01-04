#Two Sum
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res = [0] * 2
        mp = {}
        for i, ele in enumerate(nums):
            if target - ele in mp:
                res[0] = mp.get(target - ele)
                res[1] = i
                break
            mp[ele] = i
        return res
