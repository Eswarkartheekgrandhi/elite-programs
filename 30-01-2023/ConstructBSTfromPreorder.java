class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++){
            root=conBST(root,preorder[i]);
        }
        return root;
    }
    public TreeNode conBST(TreeNode root,int val){
        if(root==null){
            root=new TreeNode(val);
        }
        if(root.val>val){
            root.left=conBST(root.left,val);
        }
        if(root.val<val){
            root.right=conBST(root.right,val);
        }
        return root;
    }
}
