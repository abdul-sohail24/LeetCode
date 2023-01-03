class Solution 
{
    public int minDeletionSize(String[] strs) 
    {
        int count = 0, check, m = strs[0].length(), n = strs.length;
        for(int i=0; i<m; i++){
            check = Integer.MIN_VALUE;
            for(int j=0; j<strs.length; j++){
                if((int) strs[j].charAt(i) >= check)
                    check = (int) strs[j].charAt(i);
                else{
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}