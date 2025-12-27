#Replace Element with Greatest Element on Right side
class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        n = len(arr)
        res = [0] * n
        res[n - 1] = -1
        max = arr[n - 1]
        for i in range(n - 2, -1, -1):
            res[i] = max
            if arr[i] > max:
                max = arr[i]
        return res
