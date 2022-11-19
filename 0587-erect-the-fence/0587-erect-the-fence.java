class Solution 
{
    public int[][] outerTrees(int[][] trees) 
    {    
        Arrays.sort(trees,(a,b) ->
        {
           if(a[0] == b[0])
               return a[1] - b[1];
           else
               return a[0] - b[0];
           
        });
        
        Stack<int[]> upper = new Stack<>();
        Stack<int[]> lower = new Stack<>();
        
        for(int i=0;i<trees.length;i++)
        {            
            while(lower.size()>=2 && orientation(lower.get(lower.size()-2),lower.get(lower.size()-1),trees[i]) > 0)
                lower.pop();
            
            while(upper.size()>=2 && orientation(upper.get(upper.size()-2),upper.get(upper.size()-1),trees[i]) < 0)
                upper.pop();
            
            lower.push(trees[i]);
            upper.push(trees[i]);
        }
        
        
        HashSet<int[]> result = new HashSet<>();
        while(upper.size() != 0)
            result.add(upper.pop());

        while(lower.size() != 0)
            result.add(lower.pop());
        
        return result.toArray(new int[result.size()][]);
    }
    
    public int orientation(int[] p,int[] q,int[] r)
    {
        return ( (r[1]-q[1]) * (q[0]-p[0]) ) - ( (q[1]-p[1]) * (r[0]-q[0]) );
    }
}