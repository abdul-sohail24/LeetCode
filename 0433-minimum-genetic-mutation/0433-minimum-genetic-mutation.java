class Solution 
{
    public int minMutation(String start, String end, String[] bank) 
    {
        //BFS
        Queue<String> q = new LinkedList<>();
        Set<String> vis = new HashSet<>();
        q.add(start);
        vis.add(start);
        int steps = 0;
        char[] alphabets = {'A','C','G','T'};
        
        while(!q.isEmpty())
        {
            int nodesInQ = q.size();
            for(int j=0; j<nodesInQ; j++)
            {
                String node = q.remove();
                if(node.equals(end))
                    return steps;
                for(char c: alphabets)
                {
                    for(int i=0; i<8; i++)
                    {
                        String neighbor = node.substring(0, i) + c + node.substring(i+1);
                        if(!vis.contains(neighbor) && Arrays.asList(bank).contains(neighbor))
                        {
                            q.add(neighbor);
                            vis.add(neighbor);
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}