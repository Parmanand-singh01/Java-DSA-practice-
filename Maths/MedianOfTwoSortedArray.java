class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n= nums1.length+nums2.length;
        int k=0;
        int []ans=new int [n];
        for(int i=0;i<nums1.length;i++){
            ans[k++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            ans[k++]=nums2[i];
        }
        Arrays.sort(ans);
        
        double median=0;
            if(n%2==0){
                median=(ans[n/2]+ans[(n/2)-1])/2.0;}
                else {median=ans[n/2];
            }
        return median;
        
    }
}
