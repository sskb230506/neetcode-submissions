class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        int[] freq1= new int[26];
        int[] freq2= new int[26];
        for(int i=0;i<n1;i++){
            char c=s1.charAt(i);
            freq1[c-'a']++;
        }
        for(int i=0;i<n2;i++){
            char curr=s2.charAt(i);
            freq2[curr-'a']++;
            if(i>=n1){
                char dup=s2.charAt(i-n1);
                freq2[dup-'a']--;
            }
            if(Arrays.equals(freq1,freq2)){
                return true;
            }
        }
        return false;
        
    }
}
