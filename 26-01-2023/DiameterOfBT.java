class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    public int height(TreeNode root) {
        if(root==null){
            return 0;
        }
        //recursively get the height of left and right subtree
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        //update the diameter by comparing the current diameter with the sum of left and right subtree height
        diameter=Math.max(diameter, leftHeight+rightHeight);
        return Math.max(leftHeight, rightHeight)+1;
    }
}
