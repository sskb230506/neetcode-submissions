class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int st=i+1;
            int end=n-1;
            while(st<end){
                int sum=nums[i]+nums[st]+nums[end];
                if(sum<0){
                    st++;
                }
                else if(sum>0){
                    end--;
                }
                else{
                    List<Integer> curr= new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[st]);
                    curr.add(nums[end]);
                    list.add(curr);
                    int leftVal=nums[st];
                    st++;
                    while(st<end && nums[st]==leftVal){
                        st++;
                    }
                    int rightVal=nums[end];
                    end--;
                    while(end>=0 && nums[end]==rightVal){
                        end--;
                    }
                   
                }

            }

        }
        return list;
        
    }
}
