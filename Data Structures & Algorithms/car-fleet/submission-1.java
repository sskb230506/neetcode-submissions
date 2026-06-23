class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        Stack<Double> s = new Stack<>();

        for (int[] a : arr) {
            double time = (double)(target - a[0]) / a[1];

            if (s.isEmpty() || time > s.peek()) {
                s.push(time);
            }
        }

        return s.size();
    }
}