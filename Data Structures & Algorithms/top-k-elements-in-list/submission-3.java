class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        int[] result = new int[k];
        int idx = 0;

        for (int freq = buckets.length - 1; freq > 0 && idx < k; freq--) {
            if (buckets[freq] != null) {
                for (int val : buckets[freq]) {
                    result[idx++] = val;
                    if (idx == k) return result;
                }
            }
        }

        return result;
    }
}
