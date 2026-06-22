class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxCount=0;
        boolean[][] visited= new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    int[] count= new int[1];
                    dfs(visited,i,j,grid,count);
                    maxCount=Math.max(count[0],maxCount);
                }
            }
        }
        return maxCount;
        
    }
    static void dfs(boolean[][] visited,int i,int j,int[][] grid,int[] count){
        if(i<0 ||i>=grid.length||j<0||j>=grid[0].length){
            return;
        }
        if(visited[i][j]||grid[i][j]==0){
            return;
        }
        visited[i][j]=true;
        count[0]+=1;
        dfs(visited,i+1,j,grid,count);
        dfs(visited,i-1,j,grid,count);
        dfs(visited,i,j+1,grid,count);
        dfs(visited,i,j-1,grid,count);

    }
}
