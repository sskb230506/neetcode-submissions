class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            max=Math.max(piles[i],max);
        }
       
        int l=1;
        int r=max;
        int k=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            int c=count(piles,mid);
            if(c<=h){
                k=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
            
        }
        return k;
        
    }
    static int count(int[] piles,int mid){
        int count=0;
        for(int i=0;i<piles.length;i++){
            count+=Math.ceil((double)piles[i]/mid);
        }
        return count;
    }
}
