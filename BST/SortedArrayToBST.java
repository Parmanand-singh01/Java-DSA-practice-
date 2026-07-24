class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(0,nums.length-1,nums);
    }
    public TreeNode build(int left,int right,int [] arr){
        if(left>right) return null;
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=build(left,mid-1,arr);
        root.right=build(mid+1,right,arr);
        return root;
    }
}
