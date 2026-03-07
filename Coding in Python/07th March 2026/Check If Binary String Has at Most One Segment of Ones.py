#Check If Binary String Has at Most One Segment of Ones
class Solution:
    def checkOnesSegment(self, s: str) -> bool:
        return '01' not in s
