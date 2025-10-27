class Solution
{
        public int numberOfLaserBeams(String[] bank)
        {
                ArrayList<Integer> arr = new ArrayList<>();
                for(String str : bank)
                {
                    int count = 0;
                    for(char ch : str.toCharArray())
                        if(ch == '1')
                            count++;
                    if(count != 0)
                        arr.add(count);
                }
                int result = 0;
                for(int i = 1; i < arr.size(); i++)
                    result += (arr.get(i) * arr.get(i - 1));
                return result;
        }
}
