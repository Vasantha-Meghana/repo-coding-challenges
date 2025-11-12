class MyHashSet 
{
    ArrayList<Integer> myHSet;
    public MyHashSet() 
    {
        myHSet=new ArrayList<Integer>();
    }
    
    public void add(int key) 
    {
        if(!myHSet.contains(key))
            myHSet.add(key);
    }
    
    public void remove(int key) 
    {
        if(myHSet.contains(key))
            myHSet.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) 
    {
        if(myHSet.contains(key))
            return true;
        else
            return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
