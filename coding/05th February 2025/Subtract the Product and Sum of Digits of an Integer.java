//Subtract the Product and Sum of Digits of an Integer
class Solution 
{
    public int subtractProductAndSum(int n) 
    {
        int sum = 0;
		int product = 1;
		while(n > 0)
		{
			int r = n % 10;
			sum = sum + r;
			product = product * r;
			n = n / 10;
		}
        return product - sum;
    }
}
