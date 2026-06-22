class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=0;i<=n;i++){
            res[i]=NumBits(i);
        }
        return res;

        
    }
    static int NumBits(int i){
        int count=0;
        while(i>0){
            count+=i&1;
            i=i>>1;  
        }
        return count;

    }
}
