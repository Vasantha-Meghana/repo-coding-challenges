#Kth Distinct String in an Array
class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        map1 = {}
        for ele in arAr:
            if ele in map1:
                map1[ele] += 1
            else:
                map1[ele] = 1
        c = 0
        for ele in arr:
            if map1[ele] == 1:
                c += 1
            if c == k:
                return ele
        return ""
