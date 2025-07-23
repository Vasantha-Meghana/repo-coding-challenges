//Buddy Strings
class Solution 
{
    public boolean buddyStrings(String s, String goal) 
    {
        if(s.length() != goal.length())   return false;
        if (s.equals(goal)) 
        {
            int[] seen = new int[26];
            for (int i = 0; i < s.length(); i++) 
            {
                int index = s.charAt(i) - 'a';
                seen[index]++;
                if(seen[index] == 2)
                    return true;
            }
            return false;
        }
        int count = 0;
        int index1 = -1, index2 = -1;
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) != goal.charAt(i)) 
            {
                count++;
                if (count == 1) 
                    index1 = i;
                else if (count == 2)
                    index2 = i;
                else if(count >= 3)
                    return false;
            }
        }
        return count == 2 && s.charAt(index1) == goal.charAt(index2) && s.charAt(index2) == goal.charAt(index1);
    }
}
