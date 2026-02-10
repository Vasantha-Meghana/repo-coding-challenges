#Find Lucky Integer in an Array
class Solution:
    def findLucky(self, arr: List[int]) -> int:
        dict1 = {}
        result = -1
        for ele in arr:
            if ele in dict1:
                dict1[ele] += 1
            else:
                dict1[ele] = 1
        for k in dict1:
            if k == dict1[k] and k > result:
                result = k
        return result
