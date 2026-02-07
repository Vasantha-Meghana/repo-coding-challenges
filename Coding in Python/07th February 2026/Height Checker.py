#Height Checker
class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        result = 0
        temp = []
        for ele in heights:
            temp.append(ele)
        temp.sort()
        for i in range(len(temp)):
            if heights[i] != temp[i]:
                result += 1
        return result
