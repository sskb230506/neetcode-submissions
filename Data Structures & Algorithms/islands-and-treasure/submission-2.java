class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    q.add(new int[] {i,j});
                }
            }
        }
        if(q.size()==0){
            return;
        }
        int[][] dir= {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            for(int[] arr:dir){
                int r=curr[0]+arr[0];
                int l=curr[1]+arr[1];
                if(r<0 || r>=grid.length || l<0 || l>=grid[0].length ||grid[r][l]!=Integer.MAX_VALUE){
                    continue;
                }
                q.add(new int[] {r,l});
                grid[r][l]=grid[curr[0]][curr[1]]+1;

            }
        }
        
    }
}
