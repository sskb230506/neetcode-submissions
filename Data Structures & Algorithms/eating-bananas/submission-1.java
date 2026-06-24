class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        for (int pile : piles) {
            r = Math.max(r, pile);
        }

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (canFinish(mid, piles, h)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    static boolean canFinish(int k, int[] piles, int h) {
        int hours = 0;

        for (int pile : piles) {
            hours += (pile + k - 1) / k; 
        }

        return hours <= h;
    }
}