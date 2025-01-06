//Find the Difference of Two Arrays
class Solution 
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int n : nums1)
            set1.add(n);
        for(int n : nums2)
            set2.add(n);
        for(int n : nums1)
        {
            if(set2.contains(n))
            {
                set1.remove(n);
                set2.remove(n);
            }
        }
        ArrayList<Integer> ans1 = new ArrayList<Integer>(set1);
        ArrayList<Integer> ans2 = new ArrayList<Integer>(set2);
        ArrayList<List<Integer>> answer = new ArrayList<List<Integer>>();
        answer.add(ans1);
        answer.add(ans2);
        return answer;
    }
}
