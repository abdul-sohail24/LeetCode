class Solution 
{
    public String minWindow(String s, String t) 
    {
        //Optimized
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++)
        {
            int numOccurences = map.getOrDefault(t.charAt(i), 0);
            map.put(t.charAt(i), numOccurences + 1);
        }
        
        int i=0, j=0, count = map.size();
        int left=0, right = s.length() - 1, min = s.length();
        
        boolean found = false;
        
        while(j < s.length())
        {
            char endChar = s.charAt(j++);
            if(map.containsKey(endChar))
            {
                map.put(endChar, map.get(endChar) - 1);
                if(map.get(endChar) == 0)
                    count -= 1;
            }
            
            if(count > 0)
                continue;
            
            while(count == 0)
            {
                char startChar = s.charAt(i++);
                if(map.containsKey(startChar))
                {
                    map.put(startChar, map.get(startChar) + 1);
                    if(map.get(startChar) > 0)
                        count += 1;
                }
            }
            
            if((j - i) < min)
            {
                left = i;
                right = j;
                min = j - i;
                found = true;
            }
        }
        
        if(!found)
            return "";
        return s.substring(left-1,right);
    }
}