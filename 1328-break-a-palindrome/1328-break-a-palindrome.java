class Solution 
{
    public String breakPalindrome(String palindrome) 
    {
        if(palindrome.length() == 1)
            return "";
        
        char[] palin_array = palindrome.toCharArray();
        int flip = 1;
        
        for(int i=0; i<palin_array.length/2; i++)
        {
            if(palin_array[i] != 'a')
            {
                palin_array[i] = 'a';
                flip = 0;
                break;
            }
        }
        
        if(flip == 1)
            palin_array[palindrome.length() - 1] = 'b';
        
        StringBuilder s = new StringBuilder();
    
        for(int i=0; i<palindrome.length(); i++)
            s.append(palin_array[i]);
        
        return s.toString();
    }
}