class Solution 
{
    public String reverseWords(String s) 
    {
        List<String> words = new ArrayList<>();
        String up = "";
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                if(up != "")
                    words.add(up);
                up = "";
            }
            else
                up+=s.charAt(i);
        }
        if(s.charAt(s.length() - 1) != ' ')
            words.add(up);
        // System.out.println(words.get(1));
        String ans = "";
        for(int i=words.size()-1; i>0; i--)
        {
            ans+=words.get(i);
            ans+=" ";
        }
        ans+=words.get(0);
        return ans;
    }
}