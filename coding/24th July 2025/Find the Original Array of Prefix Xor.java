//Find the Original Array of Prefix Xor
class Solution 
{
    public int[] findArray(int[] pref) 
    {
        int[] original = new int[pref.length];
        original[0] = pref[0];
        for(int i = 1; i < pref.length; i++)
            original[i] = pref[i] ^ pref[i - 1];
        return original;
    }
}
