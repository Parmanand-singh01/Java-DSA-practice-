class Solution {
    public int kthSmallest(TreeNode root, int k) {
List<Integer> list=new ArrayList<>();
        preorder(root,list);
        Collections.sort(list);
        return list.get(k-1);
    }
   static void preorder(TreeNode root,List<Integer> list){
        if(root==null) return;
       list.add(root.val);
       preorder(root.left,list);
       preorder(root.right,list);
    }
}
