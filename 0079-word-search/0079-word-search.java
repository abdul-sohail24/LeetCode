class Solution 
{
    public boolean exist(char[][] board, String word) 
    {
        int rows = board.length;
        int columns = board[0].length;
        
        boolean[][] visited = new boolean[rows][columns];
        
        for (int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                if(word.charAt(0) == board[i][j] && search(i,j,0,word,board,visited))
                    return true;
            }
        }
        return false;
    }
    
    public boolean search(int row, int column, int index, String word, char[][] board, boolean[][] visited)
    {
        if (index == word.length())
            return true;
        
        if (row < 0 || row >= board.length || column < 0 || column >= board[row].length || word.charAt(index) != board[row][column] || visited[row][column])
            return false;
        
        visited[row][column] = true;
        
        if(search(row+1,column,index+1, word, board, visited) || search(row-1,column,index+1, word, board, visited) || search(row,column+1,index+1, word, board, visited) || search(row,column-1,index+1, word, board, visited))
            return true;
            
        visited[row][column] = false;
        
        return false;
    }
}