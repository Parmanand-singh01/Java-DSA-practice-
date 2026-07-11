class Solution {
    public int minDepth(TreeNode root) {
        return level(root);
    }
    static int level(TreeNode root){
        if(root==null) return 0;
        if(root.left==null) return 1+level(root.right);
        if(root.right==null) return 1+level(root.left);
        return 1+Math.min(level(root.left),level(root.right));
    }
}
