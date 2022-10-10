class Solution 
{
    public String breakPalindrome(String palindrome) 
    {
        int n = palindrome.length();
        if(n == 1)
            return "";
        
        char[] palin_array = palindrome.toCharArray();
        int flip = 1;
        
        for(int i=0; i<n/2; i++)
        {
            if(palin_array[i] != 'a')
            {
                palin_array[i] = 'a';
                flip = 0;
                break;
            }
        }
        
        if(flip == 1)
            palin_array[n - 1] = 'b';
        
        StringBuilder s = new StringBuilder();
    
        for(int i=0; i<n; i++)
            s.append(palin_array[i]);
        
        return s.toString();
    }
}