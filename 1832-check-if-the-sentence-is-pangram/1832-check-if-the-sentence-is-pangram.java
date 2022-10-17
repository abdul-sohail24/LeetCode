class Solution 
{
    public boolean checkIfPangram(String sentence) 
    {
        Set<Character> unique = new HashSet<Character>();
        for(int i=0; i<sentence.length(); i++)
        {
            char check = sentence.charAt(i);
            if(!unique.contains(check))
                unique.add(check);
        }
        if(unique.size() == 26)
            return true;
        return false;
    }
}