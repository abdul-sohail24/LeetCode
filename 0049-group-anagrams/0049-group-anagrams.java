class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap <String , ArrayList<String>> map = new HashMap<>();
        int n = strs.length;
        
        for(int i=0; i<n; i++)
        {
            String s = strs[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted_s = new String(arr);
            
            if(map.containsKey(sorted_s))
                map.get(sorted_s).add(s); 
            else
            {
                map.put(sorted_s, new ArrayList<>());
                map.get(sorted_s).add(s);
            }
        }
        
        return new ArrayList<>(map.values());
    }
}