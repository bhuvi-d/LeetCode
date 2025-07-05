class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int n = cardPoints.length;

       //22
        int totalSum = 0;
        for (int val : cardPoints) {
            totalSum += val;
        }

       //4
        int windowSize = n - k;
        int currentSum = 0;

        
        for (int i = 0; i < windowSize; i++) {
            currentSum += cardPoints[i];//10
        }

        int minSubarraySum = currentSum;

    
        for (int i = windowSize; i < n; i++) {
            currentSum += cardPoints[i] - cardPoints[i - windowSize];
            minSubarraySum = Math.min(minSubarraySum, currentSum);
        }

       
        return totalSum - minSubarraySum;
}
}
