class Solution {
    public void sortColors(int[] nums) {
       
        int ones=0,zeros=0,twos=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                zeros++;
            else if(nums[i]==1)
                ones++;
            else
                twos++;
        }
        int i=0;
        while(zeros-->0)
            nums[i++]=0;
        while(ones-->0)
            nums[i++]=1;
        while(twos-->0)
            nums[i++]=2;
    }
}
/*
Time Complexity : O(2N) = O(N)
Space Complexity: O(1)
*/
