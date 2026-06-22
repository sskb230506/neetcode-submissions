class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        Deque<int[]> stack = new ArrayDeque<>();
        int n=heights.length;
        for(int i=0;i<n;i++){
            int start=i;
            while(!stack.isEmpty()&& stack.peek()[1]>heights[i]){
                int[] res= stack.pop();
                start=res[0];
                maxArea=Math.max(maxArea,res[1]*(i-start));
            }
            stack.push(new int[] {start,heights[i]});
        }
        while(!stack.isEmpty()){
            int[] res= stack.pop();
            maxArea=Math.max(maxArea,res[1]*(n-res[0]));

        }
        return maxArea;
    }
}
