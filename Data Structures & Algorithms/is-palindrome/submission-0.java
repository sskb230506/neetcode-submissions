class Solution {
    public boolean isPalindrome(String s) {
        int st=0;
       s=s.toLowerCase();

        s = s.replaceAll("[^a-zA-Z0-9]","");
        int end=s.length()-1;

        while(st<end){
            if(!((s.charAt(st)) ==(s.charAt(end)))){
                return false;
            }
            st++;
            end--;

        }
        return true;
        
    }
}
