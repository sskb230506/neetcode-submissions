class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited= new boolean[grid.length][grid[0].length];
        int count=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j]&&grid[i][j]=='1'){
                    dfs(grid,i,j,visited);
                    count+=1;
                }
            }
        }
        return count;

        
    }
    static void dfs(char[][] grid,int i,int j,boolean[][] visited){
        if(i<0||i>=grid.length||j<0 ||j>=grid[0].length){
            return;
        }
        
        if(grid[i][j]=='0'||visited[i][j]){
            return;
        }
        visited[i][j]=true;
        dfs(grid,i+1,j,visited);
        dfs(grid,i-1,j,visited);
        dfs(grid,i,j+1,visited);
        dfs(grid,i,j-1,visited);

    }

}
