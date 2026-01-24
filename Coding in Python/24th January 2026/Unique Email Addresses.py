#Unique Email Addresses
class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        unique = set()
        for e in emails:
            l, d = e.split('@')
            l = l.split('+')[0]
            l = l.replace('.', '')
            unique.add((l, d))
        return len(unique)
