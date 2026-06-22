class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer>[] freq= new List[nums.length+1];
        for(int i=0;i<=nums.length;i++){
            freq[i]=new ArrayList<>();

        }
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int count=0;
        int[] ans= new int[k];
        for(int i=freq.length-1;i>0 &&count<k;i--){
            for(int n:freq[i]){
                ans[count++]=n;
                if(count==k){
                    return ans;
                }
            }

        }
        return ans;
        
    }
}
