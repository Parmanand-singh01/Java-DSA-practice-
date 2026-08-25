class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m;
        
        for(int j=0;j<n;j++){
            nums1[k]=nums2[j];
            k++;
        }
        Arrays.sort(nums1);
        
    }
}
