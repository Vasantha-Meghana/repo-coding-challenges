//Rotate String
class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        if(s.length() != goal.length()) 
            return false;
        s = s + s;
        if(s.indexOf(goal) != -1) 
            return true;
        return false;
    }
}
/*
class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        if(s.length()!=goal.length())
            return false;
        if(s.equals(goal))
            return true;
        Queue<Character> que1=new LinkedList<>();
        Queue<Character> que2=new LinkedList<>();
        for(int i = 0; i < s.length(); i++)
        {
            que1.add(s.charAt(i));
            que2.add(goal.charAt(i));
        }
        for(int j = 0; j < s.length() - 1; j++)
        {
            char temp = que1.remove();
            que1.add(temp);
            if(que1.equals(que2))
                return true;
        }
        return false; 
    }
}
*/
