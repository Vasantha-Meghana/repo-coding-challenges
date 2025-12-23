#Contains Duplicate
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s = set()
        for ele in nums:
            if ele in s:
                return True
            s.add(ele)
        return False
