class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
Arrays.sort(nums);

for (int i = 0; i < nums.length; i++) {
    if (i > 0 && nums[i] == nums[i - 1]) continue;

    int targetx = 0 - nums[i];
    int i1 = i + 1;
    int j1 = nums.length - 1;

    while (i1 < j1) {
        int sum = nums[i1] + nums[j1];

        if (sum < targetx) {
            i1++;
        } else if (sum > targetx) {
            j1--;
        } else {
            List<Integer> si = new ArrayList<>();
            si.add(nums[i]);
            si.add(nums[i1]);
            si.add(nums[j1]);
            result.add(si);

            
            while (i1 < j1 && nums[i1] == nums[i1 + 1]) i1++;
            while (i1 < j1 && nums[j1] == nums[j1 - 1]) j1--;
            i1++;
            j1--;
        }
    }
}

return result;

    }
}
