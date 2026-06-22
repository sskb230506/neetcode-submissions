class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] cnt = new int[26];

            for (char c : str.toCharArray()) {
                cnt[c - 'a']++;
            }

            String key = Arrays.toString(cnt);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}