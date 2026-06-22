class Solution {
    public int countComponents(int n, int[][] edges) {
        boolean[] visited= new boolean[n];
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(list,visited,i);
                count++;
            }
        }
        return count;

    }
    static void dfs(ArrayList<ArrayList<Integer>> list,boolean[] visited,int i){
        visited[i]=true;
        ArrayList<Integer> curr=list.get(i);
        for(int num:curr){
            if(!visited[num]){
                dfs(list,visited,num);
            }
        }

    }
}
