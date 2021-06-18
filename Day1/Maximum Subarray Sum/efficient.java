class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,ma=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum>ma)
                ma=sum;
            if(sum<0)
                sum=0;
        }
        return ma;
    }
}

/*
Time Complexity: O(N)
Space Complexity: O(1)

This algorithm is known as Kadane's Algorithm
*/
