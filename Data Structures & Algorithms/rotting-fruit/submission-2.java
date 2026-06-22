class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new int[] {i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        
        int time=0;
        int[][] dirs= {{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                int l=curr[0];
                int r=curr[1];
                for(int[] dir:dirs){
                    int a=l+dir[0];
                    int b=r+dir[1];
                    if(a<0 ||a>=grid.length ||b<0 ||b>=grid[0].length||grid[a][b]!=1){
                        continue;
                    }
                    grid[a][b]=2;
                    fresh--;
                    q.add(new int[] {a,b});


                }


            }
            time++;


        }
        return fresh==0 ? time : -1;
        

        
        
    }
}
