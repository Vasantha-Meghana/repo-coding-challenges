//Coupon Code Validator
class Solution 
{
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) 
    {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> priority = new ArrayList<>();
        ArrayList<String[]> valid = new ArrayList<>();
        priority.add("electronics");
        priority.add("grocery");
        priority.add("pharmacy");
        priority.add("restaurant");
        for(int i = 0; i < code.length; i++)
        {
            if(isActive[i] && code[i] != null && 
               code[i].matches("[a-zA-Z0-9_]+") && 
               priority.contains(businessLine[i]))
                valid.add(new String[]{code[i], businessLine[i]});
        }
        Collections.sort(valid, (a, b) -> 
            {
                int cmp = Integer.compare(priority.indexOf(a[1]), priority.indexOf(b[1]));
                if (cmp == 0) return a[0].compareTo(b[0]);
                return cmp;
            });
    for(String[] ele : valid)
        result.add(ele[0]);
    return result;
    }
}©leetcode
