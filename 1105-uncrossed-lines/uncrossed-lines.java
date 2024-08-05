class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int dp[][] = new int[n+1][m+1];

        // uncomment for memoization
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         dp[i][j] = -1;
        //     }
        // }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                int ans = 0;
                if(nums1[i-1] == nums2[j-1]){
                    ans = 1 + dp[i-1][j-1];
                }
                else{
                    ans = Math.max(dp[i-1][j], dp[i][j-1]);
                }
                dp[i][j] = ans;
            }
        }
        return dp[n][m];

        //uncomment for memoization
        // return helper(nums1, nums2, n-1, m-1, dp);
    }

    //helper function for memoization
    public int helper(int nums1[], int nums2[], int i, int j, int dp[][]){

        if(i < 0 || j < 0) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int ans = 0;
        if(nums1[i] == nums2[j]){
            ans = 1 + helper(nums1, nums2, i-1, j-1, dp);
        }
        else{
            ans = Math.max(helper(nums1, nums2, i-1, j, dp), helper(nums1, nums2, i, j-1, dp));
        }
        
        return dp[i][j] = ans;
    }
}