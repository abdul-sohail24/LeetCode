class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
        int n = word.length();
        boolean upper = true, lower = true;

        if(Character.isUpperCase(word.charAt(0)))
        {
            for(int i=1; i<n; i++)
            {
                if(Character.isUpperCase(word.charAt(i)) && upper)
                    lower = false;
                else if(Character.isLowerCase(word.charAt(i)) && lower)
                    upper = false;
                else
                    return false;
            }
        }
        else
        {
            for(int i=1; i<n; i++)
                if(Character.isUpperCase(word.charAt(i)))
                    return false;
        }

        return true; 
    }
}