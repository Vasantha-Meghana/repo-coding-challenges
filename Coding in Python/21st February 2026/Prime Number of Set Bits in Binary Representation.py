#Prime Number of Set Bits in Binary Representation
class Solution:
    def isPrime(self, n: int) -> bool:
        if n < 2:
            return False
        for i in range(2, int(n ** 0.5) + 1):
            if n % i == 0:
                return False
        return True

    def countPrimeSetBits(self, left: int, right: int) -> int:
        res = 0
        for i in range(left, right + 1):
            count = bin(i).count('1')
            if self.isPrime(count):
                res += 1
        return res
