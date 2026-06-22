class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map =new HashMap<>();
        int l=0;
        int ans=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            while((right-l+1)-Max(map) >k){
                char leftChar=s.charAt(l);
                map.put(leftChar,map.get(leftChar)-1);
                l++;
            }
            ans=Math.max(ans,right-l+1);
        }
        return ans;
        
    }
    static int Max( HashMap<Character,Integer> map){
        int max=0;
        for(int n:map.values()){
            max=Math.max(n,max);

        }
        return max;
    }
}
