//Unique Email Addresses
/*
class Solution 
{
    public int numUniqueEmails(String[] emails)
    {
        HashSet<String> set = new HashSet<>();
        for(String str : emails)
        {
            String[] arr = str.split("@");
            StringBuilder lname = new StringBuilder();
            for(int i = 0; i < arr[0].length(); i++)
            {
                if(str.charAt(i) == '+')
                    break;
                else if(str.charAt(i) != '.')
                    lname.append(str.charAt(i));
            }
            System.out.println(lname);
            arr[0] = lname.toString();
            String ele = arr[0] + "@" + arr[1];
            set.add(ele);
        }
        return set.size();
    }
}
*/
class Solution 
{
    public int numUniqueEmails(String[] emails)
    {
        int m = emails.length;
        for(int i = 0; i < m; i++)
        {
            String[] ar = emails[i].split("@");
            String local = ar[0];
	        String domain = ar[1];
	    	String[] temp;
	        if(local.contains("+"))
	        {
		        temp = local.split("\\+");
		        local = temp[0];
	        }
	        if(local.contains("."))
	        {
        	    temp = local.split("\\.");
		       	local = String.join("",temp);
	        }
            emails[i] = local + "@" + domain;
        }
		HashSet<String> set = new HashSet<>();
	    for(String ele:emails)
		    set.add(ele);
		return set.size();	
    }
}
