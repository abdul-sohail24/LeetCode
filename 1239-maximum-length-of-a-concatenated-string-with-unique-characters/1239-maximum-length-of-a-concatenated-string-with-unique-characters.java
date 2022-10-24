class Solution 
{
    public int maxLength(List<String> arr) 
    {
        build(arr, 0, new StringBuilder());
        return g_count;
    }
    
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    int g_count;
    
    public void build(List<String> arr, int index, StringBuilder sb) {
        
      
            int found = 0;
            HashMap<Character, Integer> temp = new HashMap<Character, Integer>();
            for(int j = 0; j < sb.length(); j++) {
                if(temp.get(sb.charAt(j)) != null) {
                    found = 1;
                    break;
                }
                temp.put(sb.charAt(j), 1);
            }
            if(found == 0) {
              if(g_count < sb.length()) g_count = sb.length();   
            }
        
        if(index == arr.size()) return;
        for(int i = index; i < arr.size(); i++) {
            String s = arr.get(i);
            sb.append(s);
            build(arr, i+1, sb);
            sb.delete(sb.length()-s.length(), sb.length());
        }
        
    }
}