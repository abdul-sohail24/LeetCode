class Solution 
{
    public boolean closeStrings(String word1, String word2) 
    {
        if(word1.length() != word2.length()) 
            return false;
        
        HashMap<Character, Integer> a = new HashMap<>();
        HashMap<Character, Integer> b = new HashMap<>();
        
        for(Character ch : word1.toCharArray()) 
            a.put(ch, a.getOrDefault(ch,0)+1);
        for(Character ch : word2.toCharArray()) 
            b.put(ch, b.getOrDefault(ch,0)+1);
        
        if(!a.keySet().equals(b.keySet())) 
            return false;
        
        List<Integer> aValues = new ArrayList<>(a.values());
        List<Integer> bValues = new ArrayList<>(b.values());
        
        Collections.sort(aValues);
        Collections.sort(bValues);
        
        return aValues.equals(bValues);
    }
}