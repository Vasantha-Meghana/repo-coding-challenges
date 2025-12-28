#Count Negative Numbers in a Sorted Matrix
class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        result = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if(grid[i][j] < 0):
                    result += len(grid[i]) - j
                    break
        return result
