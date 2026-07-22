class Solution {
    public boolean isValid(String s) {
Stack<Character> st=new Stack<>();
    if(s.length()%2==1) return false;
        char[]c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(c[i]=='('||c[i]=='['||c[i]=='{'){
                st.push(c[i]);
            }else {if(st.isEmpty())  return false;
            if(c[i]==')'&&st.peek()=='('||c[i]=='}'&&st.peek()=='{'||c[i]==']'&&st.peek()=='['){   st.pop();
            }
            else return false;
        }
        
    }
        return st.isEmpty();
    }
}
