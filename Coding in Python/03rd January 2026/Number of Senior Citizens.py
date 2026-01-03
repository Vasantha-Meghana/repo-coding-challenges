#Number of Senior Citizens
class Solution:
    def countSeniors(self, details: List[str]) -> int:
        result = 0
        for s in details:
            age = (int(s[-4]) * 10) + int(s[-3])
            if age > 60 :
                result += 1
        return result
