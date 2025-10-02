class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0;
        int check =1 ;
        while (check<nums.length){
            
            if (nums[unique]==nums[check]){
                check++;
            }
            else{
                unique++;
                nums[unique]=nums[check];
                check++;
            }
        }
        return unique+1;

    }
}
