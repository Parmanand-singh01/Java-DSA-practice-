class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     int prelow=0,prehi=preorder.length-1,inlow=0,inhi=inorder.length-1;
       return build(prelow,prehi,inlow,inhi,preorder,inorder);
        
    }
    TreeNode build(int prelow,int prehi,int inlow,int inhi,int [] preorder,int []inorder){
        if(prelow>prehi) return null;
        TreeNode ans=new TreeNode(preorder[prelow]);
        int r=0;
        int lo=preorder[prelow];
        for(int i=inlow;i<=inhi;i++){
    if(lo==inorder[i]){r=i; break;}
        }
        int cnt=r-inlow;
        ans.left=build(prelow+1,prelow+cnt,inlow,r-1,preorder,inorder);
        ans.right=build(prelow+cnt+1,prehi,r+1,inhi,preorder,inorder);
        return ans;
    }
}
