#Flip Square Submatrix Vertically
class Solution:
    def reverseSubmatrix(self, grid: List[List[int]], x: int, y: int, k: int) -> List[List[int]]:
        for i in range(0, k // 2):
            for j in range(0, k):
                r1 = x + i
                c1 = y + j
                r2 = x + (k - 1 - i)
                c2 = y + j
                grid[r1][c1], grid[r2][c2] = grid[r2][c2], grid[r1][c1]
        return grid
