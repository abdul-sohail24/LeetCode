class Solution 
{
    public String makeGood(String s) 
    {
        String ans = s;
        String prev = "";
        while(ans != prev)
        {
            prev = ans;
            ans = removeChar(ans);
        }
        return ans;
    }
    
    public String removeChar(String s)
    {   
        for(int i=0; i<s.length() - 1; i++)
        {
            if(((s.charAt(i) + 0) % (s.charAt(i+1) + 0)) == 32 || ((s.charAt(i+1) + 0) % (s.charAt(i) + 0)) == 32)
                s = s.substring(0,i) + s.substring(i+2);
        }
        
        return s;
    }
}