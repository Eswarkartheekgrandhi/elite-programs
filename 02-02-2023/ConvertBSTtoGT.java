class Solution {
    int sum=0;
    void convertgt(TreeNode root){
        if(root==null)
            return ;
        convertgt(root.right);
        root.val=root.val+sum;
        sum=root.val;
        convertgt(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        convertgt(root);
        return root;
    }
}
