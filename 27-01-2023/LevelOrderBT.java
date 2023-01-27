class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()!=0){
            List<Integer> ls = new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode current=queue.poll();
                ls.add(current.val);
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
            list.add(ls);
        }
        return list;
    }
}
