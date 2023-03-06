class Solution 
{
    public int findKthPositive(int[] arr, int k) 
    {
        List<Integer> converted_AL = new ArrayList<>();
        List<Integer> storing_AL = new ArrayList<>();
        int length = arr[arr.length-1];
        for(int i: arr)
            converted_AL.add(i);
        for(int i=1; i<=10000; i++)
        {
            if(!converted_AL.contains(i))
                storing_AL.add(i);
            if(storing_AL.size() == k)
                break;
        }
        return storing_AL.get(k-1);
    }
}