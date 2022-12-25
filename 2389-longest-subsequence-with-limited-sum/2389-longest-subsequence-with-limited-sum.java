class Solution 
{
    public int[] answerQueries(int[] nums, int[] queries) 
    {
        int n = nums.length;
        int m = queries.length;
        int[] ans = new int[queries.length];
        int score=0, count=0, query_count=0;

        Arrays.sort(nums);

        while(query_count < m)
        {
            for(int i=0; i<n; i++)
            {
                score += nums[i];
                if(score <= queries[query_count])
                    count++;
                else
                    break;
            }
            ans[query_count] = count;
            count = 0;
            score = 0;
            query_count++;
        }

        return ans;    
    }
}