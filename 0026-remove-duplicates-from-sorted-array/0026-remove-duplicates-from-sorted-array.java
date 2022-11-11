class Solution {
    public int removeDuplicates(int[] nums) 
    {
        List<Integer> numbers = new ArrayList<>();
        for(int i: nums)
        {
            if(!numbers.contains(i))
                numbers.add(i);
        }
        for(int i=0; i<numbers.size(); i++)
            nums[i] = numbers.get(i);
        
        return numbers.size();
    }
}