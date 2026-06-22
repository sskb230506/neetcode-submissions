class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        permutate(list,curr,nums);
        return list;

        
    }
    static void permutate(List<List<Integer>> list,List<Integer> curr,int[] nums){
        if(curr.size()==nums.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!curr.contains(nums[i])){
                
                curr.add(nums[i]);
                permutate(list,curr,nums);
                curr.remove(curr.size()-1);
            }

        }
    }
}
