class Solution 
{
    public int findJudge(int n, int[][] trust) 
    {
        if(n == 1)
            return 1;
        if(trust.length == 0)
            return -1;
        int[] arr = new int[n+1];
        int potential_tj = -1;
        Arrays.fill(arr,0);
        for(int i=0; i<trust.length; i++)
            arr[trust[i][1]]++;
        System.out.println(Arrays.toString(arr));
        for(int i=1; i<n+1; i++)
            if(arr[i] == n-1)
                potential_tj = i;
        for(int i=0; i<trust.length; i++)
            if(potential_tj == trust[i][0])
                return -1;
        return potential_tj;    
    }
}