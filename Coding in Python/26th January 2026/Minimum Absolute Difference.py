#Minimum Absolute Difference
class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        res = []
        arr.sort()
        diff = arr[1] - arr[0]
        for i in range(1, len(arr)):
            if arr[i] - arr[i - 1] < diff:
                diff = arr[i] - arr[i - 1]
        for i in range(1, len(arr)):
            if arr[i] - arr[i - 1] == diff:
                temp = []
                temp.append(arr[i - 1])
                temp.append(arr[i])
                res.append(temp)
        return res
