class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int pointer= intervals [0][1];
    	int no =0;
    	for (int k=1;k<intervals.length;k++)
    			{
    		if (intervals[k][0]<pointer) {
    			no=no+1;
    			
    			
    		}
            else {
    			pointer=intervals[k][1];
    		}
    		
    			}
    			
        return no;
    }
}
