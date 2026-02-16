#Reverse Bits
class Solution:
    def reverseBits(self, n: int) -> int:
        binary = bin(n)[2:]
        binary = binary.zfill(32)
        binary = binary[::-1]
        decimal = 0
        for digit in binary:
            decimal = decimal * 2 + int(digit)
        return decimal
