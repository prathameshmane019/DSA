import java.util.Arrays;

public class UniquePath2 { 
    int paths(int[][] grid,int m,int n,int[][] dp){
        if(m==grid.length-1 && n==grid[0].length-1 &&grid[m][n]==0) return 1; 
        if(m>=grid.length  || n>=grid[0].length ) return 0;
        if(grid[m][n]==1) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        dp[m][n] = paths(grid,m,n+1,dp) + paths(grid,m+1,n,dp);
        return dp[m][n];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
        for(int[] row : dp) Arrays.fill(row,-1);
        int m = 0;
        int n = 0;
        return paths(obstacleGrid,m,n,dp);
    } 
    public static void main(String[] args) {
        UniquePath2 up = new UniquePath2();
        int[][] grid = {
            {0,0,0},
            {0,1,0},
            {0,0,0}, 
        };
        System.out.println(up.uniquePathsWithObstacles(grid));
    }
}
