class Solution 
{
    public int minDeletionSize(String[] strs) 
    {
        int count = 0;
        int check;
        
        //get columns
        char[] x = strs[0].toCharArray();

        for(int i=0; i<x.length; i++)
        {
            check = Integer.MIN_VALUE;
            for(int j=0; j<strs.length; j++)
            {
                if((int) strs[j].charAt(i) >= check)
                {
                    check = (int) strs[j].charAt(i);
                }
                else
                {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}