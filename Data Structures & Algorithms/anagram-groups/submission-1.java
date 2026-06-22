class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList<>();
        HashMap<String,List<String>> map= new HashMap<>();
        for(String str:strs){
            char[] arr= str.toCharArray();
            Arrays.sort(arr);
            String s= new String(arr);
            if(map.containsKey(s)){
                map.get(s).add(str);
            }
            else{
                List<String> curr= new ArrayList<>();
                curr.add(str);
                map.put(s,curr);
            }
        }
        for(List<String> lis:map.values()){
            res.add(lis);
        }
        return res;
        
    }
}
