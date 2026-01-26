//Minimum Absolute Difference
class Solution 
{
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int diff = arr[1] - arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] - arr[i - 1] <= diff)
                diff = arr[i] - arr[i - 1];
        } 
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] - arr[i - 1] == diff)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i - 1]);
                temp.add(arr[i]);
                list.add(temp);
            }
        }
        return list;
    }
}
