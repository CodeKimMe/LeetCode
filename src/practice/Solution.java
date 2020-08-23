package practice;

public class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    helper(grid, i, j);
                }
            }
        }
        return ans;
    }
    
    public void helper(char[][] grid, int i, int j) {
        if (i > grid.length - 1 || j > grid[0].length - 1 || i < 0 || j < 0) {
            return;
        }
        
        if (grid[i][j] == '1') {
            grid[i][j] = '#';
        } else {
            return;
        }
        helper(grid, i-1, j);
        helper(grid, i+1, j);
        helper(grid, i, j - 1);
        helper(grid, i, j + 1);
    }
}