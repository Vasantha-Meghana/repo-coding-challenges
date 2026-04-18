//Mirror Distance of an Integer
class Solution 
{
    public int mirrorDistance(int n) 
    {
        String ns = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for(int i = ns.length() - 1; i >= 0; i--)
            sb.append(ns.charAt(i));
        int rev = Integer.parseInt(sb.toString());
        return Math.abs(n - rev);
    }
}
