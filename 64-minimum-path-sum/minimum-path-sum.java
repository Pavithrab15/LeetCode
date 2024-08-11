class Solution { 
    public int solve(int i,int j,int grid[][],int dp[][])
    {
        if(i==-1 || j==-1)
        {
            return Integer.MAX_VALUE/2;
        }
         if(i==0&&j==0)
        {
            return grid[0][0];
        } 
        if(dp[i+1][j+1]!=-1)
        {
            return dp[i+1][j+1];
        }
        else 
        {
            dp[i+1][j+1] = Math.min(grid[i][j]+solve(i-1,j,grid,dp),
            grid[i][j]+solve(i,j-1,grid,dp));
        } 
        return dp[i+1][j+1];
    }
    public int minPathSum(int[][] grid)
    {
         int n,m; 
         n = grid.length; 
         m = grid[0].length;  
         int[][] dp = new int[n+1][m+1]; 
         int i,j; 
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=m;j++)
            {
                dp[i][j]  =-1;
            }
        }
         return solve(n-1,m-1,grid,dp); 
    }
}