#Maximum Number of Balloons
class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        dict1 = dict()
        for ch in text:
            if ch in dict1:
                dict1[ch] += 1
            else:
                dict1[ch] = 1
        res = min(
            dict1.get('b', 0),
            dict1.get('a', 0),
            dict1.get('n', 0),
            dict1.get('l', 0) // 2,
            dict1.get('o', 0) // 2
        )
        return res
