class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        Arrays.sort(nums);
        subset(list,curr,0,nums);
        return list;
    }
    static void subset(List<List<Integer>> list,List<Integer> curr,int j ,int[] nums){
        if(j==nums.length){
            if(!list.contains(curr)){
                list.add(curr);
            }
            return;
        }
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<curr.size();i++){
            ans.add(curr.get(i));
        }
        ans.add(nums[j]);
        subset(list,ans,j+1,nums);
        subset(list,curr,j+1,nums);
    }
}
