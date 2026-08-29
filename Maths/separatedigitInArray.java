class Solution {
    public int[] separateDigits(int[] nums) {
        
        int n=nums.length;
        String res="";
        for(int i=0;i<n;i++){
        res+=String.valueOf(nums[i]);
       }
        int ans[]=new int [res.length()];
        for(int i=0;i<res.length();i++){
            ans[i]=res.charAt(i)-'0';
        }
        return ans;
    }
}
