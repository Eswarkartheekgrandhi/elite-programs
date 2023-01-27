class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=1;i<=size;i++){
                TreeNode curr=queue.poll();
                if(i==1){
                    list.add(curr.val);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
                if(curr.left!=null){
                    queue.add(curr.left);
                }
            }
        }
        return list;
    }
}
