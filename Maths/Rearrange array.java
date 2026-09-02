class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int p=0,ne=1;
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
        if(nums[i]>0){
            arr[p]=nums[i];
            p+=2;
        }
        else if(nums[i]<0){
            arr[ne]=nums[i];
            ne+=2;
        }
        }
        return arr; 
    }
}
