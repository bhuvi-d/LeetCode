class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int maxlen = 0;
        int count=1;
        for (int i=0;i<=n-1;i++) {
        	
        	
        	if( i!=n-1 && nums[i]<nums[i+1]){
        		count++;
        	}
            else{
        	maxlen= Math.max(maxlen, count);
            count=1;
            }
        }
        return maxlen;
        
    }
}
