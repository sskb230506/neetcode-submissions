class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> curr= new ArrayList<>();
        List<List<Integer>> list= new ArrayList<>();
        combSum(list,curr,candidates,0,target);
        return list; 
        
    }
    static void combSum(List<List<Integer>> list,List<Integer> curr,int[] candidates,int i,int target){
        if(target==0){
            Collections.sort(curr);

            if(!list.contains(curr)){
                list.add((new ArrayList<>(curr)));
            }
            return;
        }
        if(target<0 || i>=candidates.length){
            return;
        }
        List<Integer> ans= new ArrayList<>();
        for(int j=0;j<curr.size();j++){
            ans.add(curr.get(j));
        }
        ans.add(candidates[i]);
        combSum(list,ans,candidates,i+1,target-candidates[i]);
        combSum(list,curr,candidates,i+1,target);

    }
}
