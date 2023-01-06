class Solution 
{
    public int maxIceCream(int[] costs, int coins) 
    {
        //Bruteforce
        Arrays.sort(costs);
        int n = costs.length, count = 0;
        for(int i=0; i<n; i++)
        {
            if(costs[i] > coins)
                break;
            else
            {
                coins -= costs[i];
                count++;
            }
        } 
        return count;   
    }
}