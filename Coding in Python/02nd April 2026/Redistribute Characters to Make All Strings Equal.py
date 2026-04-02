#Redistribute Characters to Make All Strings Equal
class Solution:
    def makeEqual(self, words: List[str]) -> bool:
        dict1 = {}
        for word in words:
            for ch in word:
                if ch in dict1:
                    dict1[ch] += 1
                else:
                    dict1[ch] = 1
        for ch in dict1:
            if dict1[ch] % len(words) != 0:
                return False
        return True
            
