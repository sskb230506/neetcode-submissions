class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String res = new String(arr);

            if (map.containsKey(res)) {
                map.get(res).add(strs[i]); 
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(res, list);
            }
        }

    
        List<List<String>> result = new ArrayList<>();
        for (ArrayList<String> group : map.values()) {
            result.add(group);
        }

        return result;
    }
}
