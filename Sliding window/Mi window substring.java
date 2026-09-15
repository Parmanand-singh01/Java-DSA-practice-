class Solution {
    public boolean isValid(int w_table[],int t_table[]){
        for(int i = 0;i<256;i++){
            if(t_table[i]!=0 && w_table[i]<t_table[i]){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
       int l = 0;
       int min = s.length()+1;
       int start_index = 0;
       int t_table[] = new int[256];
       int w_table[] = new int[256];
       if(s.length()<t.length()){
        return "";
       }
       for(char ch : t.toCharArray()){
        t_table[ch]++;
       }

       for(int r=0;r<s.length();r++){
        int ch_r = s.charAt(r);
        w_table[ch_r]++;  
        while(isValid(w_table,t_table)){
            if(r-l+1<min){
                min = r-l+1;
                start_index = l;
            }
            int ch_l = s.charAt(l);
            w_table[ch_l]--;
            l++;
        }
       }  
    if(min==s.length()+1) return "";
       return s.substring(start_index,start_index+min);
    }
}
