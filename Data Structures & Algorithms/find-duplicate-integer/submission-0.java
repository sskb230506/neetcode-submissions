class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            if(i!=k-1&&nums[k-1]==k){
                return k;
            }
            else{
                int temp=nums[k-1];
                nums[k-1]=k;
                nums[i]=temp;
            }
        }
        return -1;
        
    }
}
