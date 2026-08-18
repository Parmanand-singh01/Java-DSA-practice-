class Solution {
    public int thirdMax(int[] nums) {
     long max=Long.MIN_VALUE,secmax=Long.MIN_VALUE,thimax=Long.MIN_VALUE;
        int n=nums.length;
        boolean hasthird=false;
        boolean hassecond=false;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }}
        for(int i=0;i<n;i++){
if(nums[i]>secmax&& nums[i]!=max){
    secmax=nums[i];
    hassecond=true;
            }}
        for(int i=0;i<n;i++){
if(nums[i]>thimax&&nums[i]!=secmax&&nums[i]!=max){
             thimax=nums[i]; 
            hasthird=true;
            }
        }
        if(thimax == Long.MIN_VALUE)
            return (int)max;
        return (int)thimax;
        
    }
}
// method 2

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
int copy[]=removeduplicate(nums); 
        int n=copy.length;
if(n<3) return copy[n-1];
        return copy[n-3];
    }
   static int []removeduplicate(int[] nums){ int j=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[j]){
                j++;
            nums[j]=nums[i];
            }
        }
return Arrays.copyOf(nums,j+1);
    }
}
