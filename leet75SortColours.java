//3 pointer solution beats 100% solutions in time complexity
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left=0;
        int right=n-1;
        int iterator=0;
        while (iterator<=right) {
        	if (nums[iterator]==0){
        		int temp= nums[left];
        		nums[left]=nums[iterator];
        		nums[iterator]=temp;
        		left++;
        	}
        	if (nums[iterator]==2){
        		int temp= nums[right];
        		nums[right]=nums[iterator];
        		nums[iterator]=temp;
        		right--;
        	}
        	else {
        		iterator++;
        	}
  
        }
        
    }
}
