class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        //Bruteforce
        if(arr.length == 1)
            return true;
        Arrays.sort(arr);
        List<Integer> counts = new ArrayList<>();
        int count = 1;
        
        int[] newarr = new int[arr.length+1];
        for(int i=0; i<arr.length; i++)
            newarr[i] = arr[i];
        newarr[newarr.length-1] = Integer.MAX_VALUE;
        
        for(int i=0; i<newarr.length-1; i++)
        {
            if(newarr[i] == newarr[i+1])
                count++;
            else
            {
                counts.add(count);
                count = 1;
            }
        }
        
        Collections.sort(counts);
        if(counts.size() == 1)
            return true;
        
        for(int i=1; i<counts.size()-1; i++)
        {
            if(counts.get(i) == counts.get(i-1) || counts.get(i) == counts.get(i+1))
                return false;
        }
        //Edge Cases
        if(counts.get(0) == counts.get(1))
            return false;
        if(counts.get(counts.size()-2) == counts.get(counts.size()-1))
            return false;
        
        return true;
    }
}