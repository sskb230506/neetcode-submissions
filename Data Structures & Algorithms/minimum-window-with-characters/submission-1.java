class Solution {
    public String minWindow(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1<n2){
            return "";
        }
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<n2;i++){
            char c=t.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> window= new HashMap<>();
        int need=map.size();
        int have=0;
        int left=0;
        int resLeft=0;
        int resRight=0;
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<n1;i++){
            char c= s.charAt(i);
            window.put(c,window.getOrDefault(c,0)+1);
            if(map.containsKey(c) && map.get(c)==window.get(c)){
                have++;
            }
            while(have==need){
                if(i-left+1<minLen){
                    minLen=i-left+1;
                    resLeft=left;
                    resRight=i;
                }
                char curr=s.charAt(left);
                window.put(curr,window.get(curr)-1);
                if(map.containsKey(curr) && window.get(curr)<map.get(curr)){
                    have--;
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE ? "": s.substring(resLeft,resRight+1);
        
    }
}
