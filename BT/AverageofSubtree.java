class Solution {
    static int count=0;
    public int averageOfSubtree(TreeNode root) {
        count=0;
        dfs(root);
        return count;
    }
    static int []dfs(TreeNode root){
        if(root==null) return new int[]{0,0};
        int left[]=dfs(root.left);
        int right[]=dfs(root.right);
        
        int sum=root.val+left[0]+right[0];
     int freq=1+left[1]+right[1];
        int avg=sum/freq;
        if(avg==root.val){
            count++;
        }
        return new int[]{sum,freq};
        
    }
}
