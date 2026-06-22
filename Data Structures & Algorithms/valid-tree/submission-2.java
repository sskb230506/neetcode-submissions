class Solution {
    public boolean validTree(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            list.get(edge[1]).add(edge[0]);
            list.get(edge[0]).add(edge[1]);
        }
        boolean[] visited= new boolean[n];
        if(hasCycle(visited, list, 0, -1)) {
            return false;
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;



    }
    static boolean hasCycle(boolean[] visited,ArrayList<ArrayList<Integer>> list,int i,int parent){
        
        visited[i]=true;
        ArrayList<Integer> curr= list.get(i);
        for(int num:curr){
            if(visited[num]&& num!=parent){
            return true;
            }
            if(!visited[num]&&hasCycle(visited,list,num,i)){
                return true;
            }
        }
        return false;
        
    }
}
