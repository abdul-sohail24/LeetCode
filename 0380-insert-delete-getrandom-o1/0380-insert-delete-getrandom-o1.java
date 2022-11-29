class RandomizedSet 
{
    HashSet<Integer> obj; //declare
    public RandomizedSet() 
    {
        obj = new HashSet<>(); //initialize
    }
    
    public boolean insert(int val) 
    {
        if(!obj.contains(val))
        {
            obj.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) 
    {
        if(obj.contains(val)) 
        {
            obj.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() 
    {
        int size = obj.size();
        int item = new Random().nextInt(obj.size());
        int i = 0;
        for(int x : obj)
        {
            if (i == item)
                return x;
            i++;
        }
        return -1;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */