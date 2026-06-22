class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
       
        int r=heights.length;
        int c=heights[0].length;
        boolean[][] pac= new boolean[r][c];
        boolean[][] atl= new boolean[r][c];
        for(int i=0;i<c;i++){
            dfs(0,i,pac,heights[0][i],heights);
            dfs(r-1,i,atl,heights[r-1][i],heights);

        }
        for(int j=0;j<r;j++){
            dfs(j,0,pac,heights[j][0],heights);
            dfs(j,c-1,atl,heights[j][c-1],heights);
        }
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(pac[i][j]&&atl[i][j]){
                    ArrayList<Integer> list= new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    result.add(list);

                }
            }
        }
        return result;


        
    }
    static void dfs(int l,int r,boolean[][] visit,int curr,int[][] heights){
        if(l<0 ||r<0 ||l>=heights.length || r>=heights[0].length ||visit[l][r]||heights[l][r]<curr){
            return;
        }
        visit[l][r]=true;
        dfs(l+1,r,visit,heights[l][r],heights);
        dfs(l-1,r,visit,heights[l][r],heights);
        dfs(l,r+1,visit,heights[l][r],heights);
        dfs(l,r-1,visit,heights[l][r],heights);

    }
}
