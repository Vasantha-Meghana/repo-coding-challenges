#Largest 3-Same-Digit Number in String
class Solution:
    def largestGoodInteger(self, num: str) -> str:
        arr = ["999", "888", "777", "666", "555", "444", "333", "222", "111", "000"]
        for ele in arr:
            if ele in num:
                return ele
        return ""
