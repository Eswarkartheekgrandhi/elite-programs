class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> inorder=new ArrayList<>();
        result(root,inorder);
        return inorder;
    }
    void result(TreeNode root,ArrayList<Integer> inorder){
        if (root==null){
            return ;
        }
        result(root.left,inorder);
        inorder.add(root.val);
        result(root.right,inorder);
    }
}
