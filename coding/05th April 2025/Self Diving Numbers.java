//Self Diving Numbers
class Solution 
{
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = left; i <= right; i++)
        {
            int num = i, temp = i;
            boolean f = true;
            while(num > 0)
            {
                int r = num % 10;
                if(r == 0)
                {
                    f = false;
                    break;
                }
                if(temp % r != 0)
                {
                    f = false;
                    break;
                }
                num = num / 10;
            }
            if(f == true)
                arr.add(i);
        }
        return arr;
    }
}
