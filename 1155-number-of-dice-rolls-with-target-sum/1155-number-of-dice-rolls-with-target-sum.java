class Solution 
{
    Map<String,Integer> map = new HashMap<>();
    public int numRollsToTarget(int n, int m, int target) 
    {
        //Edge Cases
        if(m*n < target || n > target)
            return 0;
        
        if(n == 1)
        {
            if(m < target)
                return 0;
            else
                return 1;
        }
        
        String key = "" + n+m+target;
        if(!map.containsKey(key))
        {
            int summ = 0;
            for(int i=1; i<=m; i++)
            {
                summ += numRollsToTarget(n-1, m, target-i);
                summ %= 1000000007;
            }
            map.put(key,summ);
        }
        
        return map.get(key);
    }
}
