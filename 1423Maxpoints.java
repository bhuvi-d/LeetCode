class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int maxscore = 0;
        int max_points =0;
        // to find sum of arr
        for (int k1=0;k1<n;k1++) {
        	max_points+=cardPoints[k1];
        }
        
        int window= n-k;
        for (int i =0 ;i<n;i++) {
        	int sumx=0;
        	int j=i;
        	while (i+window<=n && j<i+window ) {
        		sumx+=cardPoints[j];
        		j++;
        		
        	}
        	
        	if (sumx!=0) {
        	 maxscore = Math.max(maxscore, (max_points-sumx));
        	}
        	
        }
        if (maxscore==0){
            return max_points;
        }
        else{
        return maxscore;
        }
        
    }
}
