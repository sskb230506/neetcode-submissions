class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int[] ans = new int[nums.length];
       
        Deque<Integer> s= new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
             while(!s.isEmpty()&&nums[i]>nums[s.peek()]){
                int k=s.pop();
                ans[k]=i-k;
                
            }
            s.push(i);
        }
   
        return ans;
        
        
    }
}
