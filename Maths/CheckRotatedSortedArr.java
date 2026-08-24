class Solution {
    public boolean check(int[] nums) {
        int []ori=Arrays.copyOf(nums,nums.length);
        Arrays.sort(ori);
        for(int k=0;k<ori.length;k++){
int []s=Arrays.copyOf(ori,ori.length);
            reverse (s,0,k-1);
            reverse(s,k,s.length-1);
            reverse(s,0,s.length-1);
if(Arrays.equals(s,nums)) return true;
        }
        return false;
        
    }
    static void reverse(int[]arr,int st,int ed){
    while(st<ed){
    int temp=arr[st];
    arr[st]=arr[ed];
    arr[ed]=temp;st++;ed--;
    }}
    
}
