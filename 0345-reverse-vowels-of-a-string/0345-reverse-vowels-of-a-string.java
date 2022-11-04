class Solution 
{
    public String reverseVowels(String s) 
    {
        char[] s_array = s.toCharArray();
        String ans = "";
        List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        
        List<Character> present = new ArrayList<>();
        for(int i=0; i<s.length(); i++)
        {
            if(vowels.contains(s.charAt(i)))
                present.add(s.charAt(i));
        }
        Collections.reverse(present);
        
        int k=0;
        for(int i=0; i<s.length(); i++)
        {
            if(vowels.contains(s.charAt(i)))
            {
                s_array[i] = present.get(k);
                ans += s_array[i];
                k++;
            }
            else
                ans += s_array[i];
        }
        
        return ans;
    }
}