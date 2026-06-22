class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res= new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        generate(res,0,0,ans,n);
        return res;
        
    }
    static void generate(ArrayList<String> res,int l,int r,StringBuilder stack,int n){
        if(l==r && r==n){
            res.add(stack.toString());
            return;
            
        }
        if(l<n){
            stack.append('(');
            generate(res,l+1,r,stack,n);
            stack.deleteCharAt(stack.length()-1);
        }
        if(r<l){
            stack.append(')');
            generate(res,l,r+1,stack,n);
            stack.deleteCharAt(stack.length()-1);
        }

    }
}
