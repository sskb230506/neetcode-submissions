class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> innerList= new ArrayList<>();
        List<List<Integer>> list= new ArrayList<>();
        subSet(innerList,list,0,nums);
        return list;
        
    }
    static void subSet(List<Integer> innerList,List<List<Integer>> list,int i,int[] nums){
        if(i==nums.length){
            list.add(innerList);
            return;
        }
        List<Integer> inner= new ArrayList<>();
        for(int j=0;j<innerList.size();j++){
            inner.add(innerList.get(j));
        }
        inner.add(nums[i]);

        subSet(inner,list,i+1,nums);
        subSet(innerList,list,i+1,nums);

    }
}
