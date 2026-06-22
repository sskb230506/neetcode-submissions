class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] bool= new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(check(board,word,i,j,0,bool)){
                    return true;
                }
            }
        }
        return false;


        
    }
    static boolean check(char[][] board,String word,int l,int r,int i,boolean[][] visited){
         
        if(i==word.length()){
            return true;
        }
        if(l<0 ||l>=board.length||r<0||r>=board[0].length){
            return false;
        }
        if(visited[l][r]){
            return false;
        }
        if(word.charAt(i)!=board[l][r]){
            return false;
        }
        visited[l][r]=true;
        boolean ls=check(board,word,l+1,r,i+1,visited);
        boolean ds=check(board,word,l,r-1,i+1,visited); 

        boolean rs=check(board,word,l-1,r,i+1,visited);
        boolean ts=check(board,word,l,r+1,i+1,visited);
        visited[l][r]=false;
        return ls||ds||rs||ts;
    }
}
