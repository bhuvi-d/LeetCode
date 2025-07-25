#Runtime beats 100 % .py solutions
#author bhuvi-d


class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        low = 0
        high = len(nums) - 1
        mid = 0

        while low <= high:

            mid = (high + low) // 2

            
            if nums[mid] < target:
                low = mid + 1

            
            elif nums[mid] > target:
                high = mid - 1

           
            
            elif nums[mid]==target:
                return mid

       
        return low



    
