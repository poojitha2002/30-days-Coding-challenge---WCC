class Solution {
    public int maxSubArray(int[] nums) {
        int ma=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum>ma)
                    ma=sum;
            }
        }
        return ma;
    }
}

/*
Time Complexity: O(n2)
Space Complexity: O(1)

Producing all sub arrays and taking max sum of it
*/

/* 
There is another worst solution possible.
That is O(n3) Solution, 
produce subarrays using 3 loops

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
              int sum=0;
              for(int k=i;k<=j;k++)
              {
              sum+=nums[k];
              }
              ma=Math.max(ma,sum);
            }
        }
        return ma;
*/
