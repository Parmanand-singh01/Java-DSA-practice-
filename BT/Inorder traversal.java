class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
       inorder(root,arr);
        return arr;
    }
    void inorder(TreeNode root,List<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
        
    }
}
