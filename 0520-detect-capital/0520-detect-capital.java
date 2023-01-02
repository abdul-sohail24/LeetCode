class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
        int n = word.length();
        
        if(n == 1)
            return true;

        if(Character.isUpperCase(word.charAt(0)))
        {
            if(Character.isUpperCase(word.charAt(1)))
            {
                for(int i=2; i<n; i++)
                {
                    if(Character.isLowerCase(word.charAt(i)))
                        return false;
                }
            }

            if(Character.isLowerCase(word.charAt(1)))
            {
                for(int i=2; i<n; i++)
                {
                    if(Character.isUpperCase(word.charAt(i)))
                        return false;
                }
            }
        }

        else
        {
            if(Character.isUpperCase(word.charAt(1)))
            {
                return false;
            }

            if(Character.isLowerCase(word.charAt(1)))
            {
                for(int i=2; i<n; i++)
                {
                    if(Character.isUpperCase(word.charAt(i)))
                        return false;
                }
            }
        }

        return true;
    }
}