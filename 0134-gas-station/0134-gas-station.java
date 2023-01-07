class Solution 
{
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int n = gas.length;
        int tank=0, startIndex=0, total=0;
        
        for(int i=0; i<n; i++)
        {
            tank += gas[i]-cost[i];
            total += gas[i]-cost[i];
            if(tank < 0)
            {
                startIndex = (i+1);
                tank = 0;
            }
        }
        if (total>=0)
            return startIndex;
        else
            return -1;    
    }
}