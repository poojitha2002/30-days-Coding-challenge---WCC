class Solution {
    public int findDuplicate(int[] nums) {
       
        for(int i=0;i<nums.length;i++)
        {
            if(nums[Math.abs(nums[i])]<0)
                return Math.abs(nums[i]);
            nums[Math.abs(nums[i])]*=-1;
        }
        return -1;
        
    }
}

/* 
Time Complexity: O(N)
Space Complexity: O(1)
This method works only for positive numbers and the range is btw 1 to N.
And in this method we are modifying our original array, so is there any method which doesn't modify and will be O(N)? Check the next file...
*/
