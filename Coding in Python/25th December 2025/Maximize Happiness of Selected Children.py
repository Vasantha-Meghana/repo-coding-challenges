#Maximize Happiness of Selected Children
class Solution:
    def maximumHappinessSum(self, happiness: List[int], k: int) -> int:
        happiness.sort()
        result = 0
        c = 0
        i = len(happiness) - 1
        while i >= 0 and c < k:
            val = happiness[i] - c
            if val <= 0:
                break
            result += val
            c += 1
            i -= 1
        return result
