class Solution {
    public int maxProduct(int[] nums) {
       
        int n = nums.length;
        int maxval=Integer.MIN_VALUE;
        for (int i=0;i<n;i++) {
        	maxval=Math.max(maxval, nums[i]);
        }
        int currmax=1;
        int currmin=1;
        for (int k=0;k<n;k++) {
        	int temp=currmax*nums[k];
        	currmax=Math.max(temp, currmin*nums[k]);
        	currmax=Math.max(currmax,nums[k] );
        	currmin=Math.min(temp, currmin*nums[k]);
        	currmin=Math.min(currmin,nums[k] );
        	
        	maxval= Math.max(currmax, maxval);
        	
        }
        
        return maxval; 
    }
}
