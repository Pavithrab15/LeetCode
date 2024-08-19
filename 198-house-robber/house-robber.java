class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0)
        { 
        return 0;
        }

        int prev1 = 0;
        int prev2 = 0;

       for(int i=0;i<nums.length;i++){
        int num=nums[i];
            int current = Math.max(prev2 + num, prev1);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}