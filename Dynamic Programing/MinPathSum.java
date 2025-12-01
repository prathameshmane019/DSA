import java.util.Arrays;

public class MinPathSum { 
    int paths(int[][] grid,int m,int n,int[][] dp){ 
        if (m>=grid.length || n>=grid[0].length) return 0;  
        if (dp[m][n]!=-1) return dp[m][n];
        if(m== grid.length-1 ) return grid[m][n]+paths(grid,m,n+1 ,dp); 
        if( n== grid[0].length-1) return  grid[m][n]+paths(grid,m+1,n,dp) ;
         return dp[m][n] =  grid[m][n]+ Math.min(paths(grid,m,n+1 ,dp),paths(grid,m+1,n,dp));  
    } 
    public int minPathSum(int[][] grid) {
         int[][] dp = new int[grid.length+1][grid[0].length+1];
        for(int[] row : dp) Arrays.fill(row,-1);
        int m = 0;
        int n = 0;
        return paths(grid,m,n,dp);
    }   
    public static void main(String[] args) {
        MinPathSum mps = new MinPathSum();
    
        int[][] grid = {
            {1,3,5},
            {4,1,4},
            {4,1,3}
        };
        System.out.println(mps.minPathSum(grid));
    }
}
