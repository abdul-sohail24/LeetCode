class Solution 
{
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        int goal_node = graph.length - 1;
        int last_node;
        int[] neighbors;

        queue.add(Arrays.asList(0));

        //BFS
        while(!queue.isEmpty())
        {
            List<Integer> path = queue.poll();
            last_node = path.get(path.size() - 1);
            if(goal_node == last_node)
                ans.add(new ArrayList<>(path));
            else
            {
                neighbors = graph[last_node];
                for(int neighbor:neighbors)
                {
                    List<Integer> list = new ArrayList<>(path);
                    list.add(neighbor);
                    queue.add(list);
                }
            }
        }

        return ans;    
    }
}