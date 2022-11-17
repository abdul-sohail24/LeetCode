class Solution 
{
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) 
    {
        //overlaps
        int overlap_width = Math.min(ax2,bx2) - Math.max(ax1,bx1);
        int overlap_height = Math.min(ay2,by2) - Math.max(ay1,by1);
        
        //no overlap scenarios
        if(overlap_width < 0)
            overlap_width = 0; 
        if(overlap_height < 0)
            overlap_height = 0; 
        
        int area1 = Math.abs((ax2-ax1)*(ay2-ay1));
        int area2 = Math.abs((bx2-bx1)*(by2-by1));
        int overlap_area = overlap_width*overlap_height;
        
        return (area1+area2)-overlap_area;
    }
}