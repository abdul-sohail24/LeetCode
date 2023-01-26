class Solution 
{
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Subsequences(res, ans, candidates, target, 0, 0);
        return res;
    }

    public void Subsequences(List<List<Integer>> res, List<Integer> ans, int[] candidates, int target, int index, int sum)
    {
        //Base Case
        if(sum > target)
            return;

        if(index == candidates.length)
        {
            if(sum == target)
                res.add(new ArrayList<>(ans));
            return;
        }

        //Pick
        if(sum <= target)
        {
            ans.add(candidates[index]);
            sum += candidates[index];
            Subsequences(res, ans, candidates, target, index, sum);
            sum -= candidates[index];
            ans.remove(ans.size() - 1);
        }

        //Not Pick
        Subsequences(res, ans, candidates, target, index+1, sum);
    } 
}