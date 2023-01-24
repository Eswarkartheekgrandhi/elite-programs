class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(Height(root)==-1){
            return false;
        }
        return true;
    }
    public int Height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=Height(root.left);
        int rh=Height(root.right);
        if(lh==-1||rh==-1)
        return -1;
        if(Math.abs(lh-rh)>1)
        return -1;
        return Math.max(lh,rh)+1;
    }
}
