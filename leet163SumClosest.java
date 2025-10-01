class Solution {
    public int threeSumClosest(int[] nums, int target) {
       
    Arrays.sort(nums);
    
    int minsum = nums[0] + nums[1] + nums[2];
    int diff = Math.abs(target - minsum);

    for (int i = 0; i < nums.length - 2; i++) {
        int i1 = i + 1;
        int j1 = nums.length - 1;

        while (i1 < j1) {
            int suminloop = nums[i] + nums[i1] + nums[j1];
            int diffinloop = Math.abs(target - suminloop);

            if (diffinloop < diff) {
                minsum = suminloop;
                diff = diffinloop;
            }

            if (suminloop > target) {
                j1--;
            } else if (suminloop < target) {
                i1++;
            } else {
                
                return target;
            }
        }
    }

    return minsum;
}

    }
