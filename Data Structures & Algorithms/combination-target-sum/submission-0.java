class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        combSum(nums,target,list,curr,0);
        return list;

        
    }
    static void combSum(int[] nums,int target,List<List<Integer>> list,List<Integer> curr,int i){
        if(target==0){
            list.add(new ArrayList<>(curr));
            return;
        }
        if(target<0 || i>=nums.length){
            return;
        }
        curr.add(nums[i]);
        combSum(nums,target-nums[i],list,curr,i);
        curr.remove(curr.size()-1);
        combSum(nums,target,list,curr,i+1);
    }

}
