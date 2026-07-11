class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
int inorder[]=Arrays.copyOf(preorder,preorder.length);
        int n=preorder.length;
        int prelow=0,prehi=n-1,inlow=0,inhi=n-1;
        Arrays.sort(inorder);
        return build(prelow,prehi,inlow,inhi,preorder,inorder);
    }
TreeNode build(int prelow,int prehi,int inlow,int inhi,int []preorder,int []inorder){
    if(prelow>prehi) return null;
    TreeNode root=new TreeNode(preorder[prelow]);
    int r=0;
    for(int i=inlow;i<=inhi;i++){
        if(preorder[prelow]==inorder[i]){
            r=i;break;
        }
    }
    int cnt=r-inlow;
    root.left=build(prelow+1,prelow+cnt,inlow,r-1,preorder,inorder);
root.right=build(prelow+cnt+1,prehi,r+1,inhi,preorder,inorder);
    return root;
}
}
