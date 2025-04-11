//Count Symmetric Integers
class Solution 
{
    public int countSymmetricIntegers(int low, int high) 
    {
        int count = 0;
        for(int i = low; i <= high; i++)
		{
			int lsum = 0, rsum = 0, c = 0, n = i, n1 = i;
			while(n != 0)
			{
				c++;
				n = n / 10;	
			}
			if(c % 2 == 0)
			{
				int p = (int)Math.pow(10,c/2);
				int r = n1 % p;
				int l = n1 / p;
				while(r != 0)
				{
					int r1 = r % 10;
					r = r / 10;
					rsum = rsum + r1;
				}
				while(l != 0)
				{
					int r2 = l % 10;
					l = l / 10;
					lsum = lsum + r2;
				}
				if(lsum == rsum)
					count++;
			}
		}
        return count;
    }
}
