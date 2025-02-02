//Insert Delete GetRandom O(1)
class RandomizedSet
{
    public ArrayList<Integer> arr;
    public RandomizedSet() 
    {
        arr = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) 
    {
        if(arr.contains(val))
            return false;
        return arr.add(val);
    }
    
    public boolean remove(int val) 
    {
        return arr.remove(Integer.valueOf(val));
    }
    
    public int getRandom() 
    {
        Random random = new Random();
        return arr.get(random.nextInt(arr.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
