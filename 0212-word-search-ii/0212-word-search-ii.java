class TreeNode
{
	String word;
	HashMap<Character,TreeNode> nodes;
	public  TreeNode()
    {
		nodes = new HashMap<>();
	}
}

class Solution 
{
	public List<String> findWords(char[][] board, String[] words) 
    {
		HashSet<String> record = new HashSet<>();
		TreeNode root = new TreeNode();

		for(String word : words)
        {
			TreeNode node = root;
			for(int i=0;i<word.length();i++)
            {
				if(node.nodes.get(word.charAt(i))==null)
					node.nodes.put(word.charAt(i),new TreeNode());
				node = node.nodes.get(word.charAt(i));
			}
			node.word = word;
		}

		int[][] visited = new int[board.length][board[0].length];
		int[][] directs = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
		for(int i=0;i<board.length;i++)
			for(int j=0;j<board[0].length;j++)
				if(root.nodes.containsKey(board[i][j]))
					dfs(root.nodes.get(board[i][j]),i,j,board,record,visited,directs);

		List<String> result = new ArrayList<>();
		for(String word : record)
			result.add(word);
		return result;
	}

	public void dfs(TreeNode node,int i,int j,char[][] board,HashSet<String> record,int[][] visited,int[][] directs)
    {
		if(visited[i][j]==1) 
            return;
		visited[i][j] = 1;
		if(node.word!=null) 
			record.add(node.word);

		for(int[] direct : directs)
        {
			int newI = i+direct[0];
			int newJ = j+direct[1];
			if(newI>=0 && newI <board.length && newJ >=0 && newJ < board[0].length)
				if(node.nodes.containsKey(board[newI][newJ]))
					dfs(node.nodes.get(board[newI][newJ]),newI,newJ,board,record,visited,directs);
		}
		visited[i][j] = 0;
	}
}