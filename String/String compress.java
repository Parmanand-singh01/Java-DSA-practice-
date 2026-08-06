class Solution {
    public int compress(char[] chars) {
        ArrayList<Character> list=new ArrayList<>();
        int i=0;
        while (i<chars.length){
            char ch=chars[i];
            int count=0;
while(i<chars.length&&chars[i]==ch){
              count++;
    i++;
            }
            list.add(ch);
            if(count>1){for(char r:String.valueOf(count).toCharArray()){
         list.add(r);}       
            }

        } 
        
    for(int j=0;j<list.size();j++){
            chars[j]=list.get(j);
        }
        return list.size();
    }
}
