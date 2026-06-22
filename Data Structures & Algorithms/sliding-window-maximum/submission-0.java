

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (k > n) {
            return new int[]{};
        }

        int[] ans = new int[n - k + 1];
        int idx = 0;

        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            maxHeap.add(new int[]{nums[i], i});

            if (i >= k - 1) {
               
                while (maxHeap.peek()[1] <= i - k) {
                    maxHeap.poll(); 
                }

                
                ans[idx++] = maxHeap.peek()[0];
            }
        }

        return ans;
    }
}
