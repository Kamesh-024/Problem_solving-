class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        Stack <Character> st =new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch =='(') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                char popped =st.pop();
                if(ch=='}' && popped!='{') return false;
                if(ch==']' && popped!='[') return false;
                if(ch==')' && popped!='(') return false;
            }
        }
        
        if(st.isEmpty()) return true;
        else return false;
        
    }
}