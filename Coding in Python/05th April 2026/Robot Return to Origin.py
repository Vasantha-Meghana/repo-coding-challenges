#Robot Return to Origin
class Solution:
    def judgeCircle(self, moves: str) -> bool:
        i = 0
        j = 0
        for ch in moves:
            if ch == 'R':
                j += 1
            elif ch == 'L':
                j -= 1
            elif ch == 'U':
                i -= 1
            elif ch == 'D':
                i += 1
        return i == 0 and j == 0
