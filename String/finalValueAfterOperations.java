class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n=operations.length;
        int p=0;
        for(int i=0;i<n;i++){
         p+=getresult(operations[i]);
        }
        return p;
    }
    public int getresult(String s){
        if(s.equals("X++")|| s.equals("++X")){
            return 1;
        }else if(s.equals("X--") || s.equals("--X")){
            return -1;
        }
        return 0;
    }
}
