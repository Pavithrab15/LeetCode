
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        Arrays.sort(nums);
        int count=1, maxi=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i+1]-nums[i]==1){
                count++;
            }else{
                maxi=Math.max(maxi, count);
                count=1;
            }
        }
        maxi=Math.max(maxi, count);
        return maxi;
    }
}