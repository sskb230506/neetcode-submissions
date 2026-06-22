class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ans = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            char r= t.charAt(i);
            ans[r-'a']--;
            ans[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ans[i]!=0){
                return false;

            }
        }
        return true;



    }
}
