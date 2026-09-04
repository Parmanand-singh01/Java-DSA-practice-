class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n=nums.length;
        String s="";
        for(int i:nums){
            s+=String.valueOf(i);
        }
        int count=0;
        for(char i:s.toCharArray()){
            if(digit==i-'0'){
                count++;
            }
        }
       return count;
        
    }
}
