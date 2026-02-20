#Special Binary String
class Solution:
    def makeLargestSpecial(self, s: str) -> str:
        if s == '':
            return ''
        res = []
        cnt = 0
        i = j = 0
        while i < len(s):
            cnt += 1 if s[i] == '1' else -1
            if cnt == 0:
                res.append('1' + self.makeLargestSpecial(s[j + 1 : i]) + '0')
                j = i + 1
            i += 1
        res.sort(reverse = True)
        return ''.join(res)
