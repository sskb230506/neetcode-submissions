class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n=s.length();
        int left=0;
        int maxLen=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            while((i-left+1)-Max(map)>k){
                char dup=s.charAt(left);
                map.put(dup,map.get(dup)-1);
                left++;
            }
            maxLen=Math.max(maxLen,i-left+1);
        }
        return maxLen;
        
    }
    static int Max(HashMap<Character,Integer> map){
        int max=0;
        for(int n:map.values()){
            max=Math.max(max,n);

        }
        return max;
    }
}
