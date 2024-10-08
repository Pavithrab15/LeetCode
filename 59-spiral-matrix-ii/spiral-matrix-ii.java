class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int right = n-1;
        int top=0; 
        int bottom = n-1; 
        int left = 0;
        int res = 1;
        while(right>=left && top<=bottom){
            for(int i=left; i<=right; i++){
                ans[top][i]=res++;
            }
            top++;
            for(int i=top; i<=bottom; i++){
                ans[i][right]=res++;
            } 
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    ans[bottom][i]=res++;
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    ans[i][left]=res++;
                }
                left++;
            }
        }
        return ans;
    }
}