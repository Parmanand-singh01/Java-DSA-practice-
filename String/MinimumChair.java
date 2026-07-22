class Solution { //3168. Minimum Number of Chairs in a Waiting Room
    public int minimumChairs(String s) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(char c:s.toCharArray()){
            if(c=='E'){
                count++;
     max=Math.max(max,count);
            }else count--;
        }
        return max;
    }
}
