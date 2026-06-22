class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int n=s.length();
        int left=0;
        int maxLen=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                while(map.containsKey(c)){
                    char dup=s.charAt(left);
                    map.put(dup,map.get(dup)-1);
                    if(map.get(dup)==0){
                        map.remove(dup);
                    }
                    left++;
                }
            }
            map.put(c,map.getOrDefault(c,0)+1);
            maxLen=Math.max(maxLen,i-left+1);
        }
        return maxLen;
        
    }
}
