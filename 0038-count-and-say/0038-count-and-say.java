class Solution 
{
    public String countAndSay(int n) 
    {
        if(n == 1)
            return "1";
        String res = "1";
        for(int j=2; j<=n; j++)
        {
            String add = "";
            res = res+'^';
            int counter = 1;
            for(int i=1; i<res.length(); i++)
            {
                if(res.charAt(i) == res.charAt(i-1))
                    counter++;
                else
                {
                    add = add+counter;
                    add = add+res.charAt(i-1);
                    counter = 1;
                }
            }
            res = add;
        }
        return res;
    }
}