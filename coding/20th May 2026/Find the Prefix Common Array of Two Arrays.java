//Find the Prefix Common Array of Two Arrays
class Solution 
{
    public int[] findThePrefixCommonArray(int[] A, int[] B)
    {
        int res[] = new int[A.length];
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        for(int i = 0; i < A.length; i++)
        {
            setA.add(A[i]);
            setB.add(B[i]);
            int c = 0;
            for(int ele : setA)
            {
                if(setB.contains(ele))
                    c++;
            }
            res[i] = c;
        }
        return res;
    }
}
