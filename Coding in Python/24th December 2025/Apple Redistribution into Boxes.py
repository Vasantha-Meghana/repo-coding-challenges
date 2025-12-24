#Apple Redistribution into Boxes
class Solution:
    def minimumBoxes(self, apple: List[int], capacity: List[int]) -> int:
        total = 0
        res = 0
        for ele in apple:
            total += ele
        capacity.sort()
        for i in range(len(capacity) - 1, -1, -1):
            if total <= 0:
                break
            res += 1
            total -= capacity[i]
        return res
