class Solution 
{
    public String frequencySort(String s) 
    {
        //HashMap
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);

        //Sorting in Priority Queue 
        PriorityQueue<Character> queue = new PriorityQueue((a,b) -> map.get(b) - map.get(a));
        queue.addAll(map.keySet());

        //Queue to String
        StringBuilder str = new StringBuilder();
        while(!queue.isEmpty())
        {
            char curr = queue.remove();
            for(int i=0; i<map.get(curr); i++)
                str.append(curr);
        }
        
        return str.toString();
    }
}