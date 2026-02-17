#Binary Watch
class Solution:
    def readBinaryWatch(self, turnedOn: int) -> List[str]:
        result = []
        for h in range(12):
            for m in range(60):
                if(bin(h).count('1') + bin(m).count('1') == turnedOn):
                    time = f"{h}:{m:02d}"
                    result.append(time)
        return result
