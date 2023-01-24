class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        postorder(root,ls);
        return ls;
    }
    public void postorder(TreeNode root,List<Integer> ls){
        if(root==null){
            return;
        }
        postorder(root.left,ls);
        postorder(root.right,ls);
        ls.add(root.val);
    }
}
