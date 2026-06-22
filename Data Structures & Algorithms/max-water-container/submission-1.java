class Solution {
    public int maxArea(int[] heights) {
        int st=0;
        int end=heights.length-1;
        int max=0;
        while(st<end){
            int curr=Math.min(heights[st],heights[end])*(end-st);
            max=Math.max(max,curr);
            if(heights[st]>heights[end]){
                end--;
            }
            else{
                st++;
            }

        }
        return max;
        
    }
}
