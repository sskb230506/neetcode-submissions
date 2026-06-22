class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list= new ArrayList<>();
        List<String> curr= new ArrayList<>();
        part(0,s,list,curr);
        return list;
        
    }
    static void part(int i,String s,List<List<String>> list,List<String> curr){
        if(i>=s.length()){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int j=i;j<s.length();j++){
            if(isPalindrome(s,i,j)){
                curr.add(s.substring(i,j+1));
                part(j+1,s,list,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    static boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
}
