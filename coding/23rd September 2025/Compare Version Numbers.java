//Compare Version Numbers
class Solution 
{
    public int compareVersion(String version1, String version2) 
    {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = Math.max(n1, n2);
        for(int i = 0; i < n; i++)
        {
            int v1 = 0, v2 = 0;
            if(i < n1)
                v1 = Integer.valueOf(arr1[i]);
            if(i < n2)
                v2 = Integer.valueOf(arr2[i]);
            if(v1 > v2)
                return 1;
            else if(v1 < v2)
                return -1;
        }
        return 0;
    }
}
