class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>ar=new ArrayList<>();
        inOrder(root,ar);        
        return ar.get(k-1);
    }
    public void inOrder(TreeNode root,List<Integer>ar){
        if(root==null) return;

        inOrder(root.left,ar);
        ar.add(root.val);
        inOrder(root.right,ar);

    }
    
}
