class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q= new LinkedList<>(); 
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    q.offer(new int[] {i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int x= curr[0];
            int y=curr[1];
            int[][] dirs= {{-1,0},{1,0},{0,1},{0,-1}};
            for(int[] dir : dirs){
                int nx=x+dir[0];
                int ny=y+dir[1];
                if(nx>=m || ny>=n || nx<0 || ny<0 || grid[nx][ny]!=Integer.MAX_VALUE){
                    continue;
                }
                grid[nx][ny]=grid[x][y]+1;
                q.offer(new int[] {nx,ny});
            }
        }      
    }
}
