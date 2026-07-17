class Solution {
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        levels(root);
        return max;
    }
    int levels(TreeNode root){
        if(root==null) return 0;
        int l=levels(root.left);
        int r=levels(root.right);
        max=Math.max(max,l+r);
        return 1+Math.max(l,r);
    }
}
