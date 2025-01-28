//Unique Email Addresses
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
		HashMap<String, Integer> map = new HashMap<>();
	    for(String ele:emails)
		    map.put(ele, 1);
		return map.size();	
    }
}
