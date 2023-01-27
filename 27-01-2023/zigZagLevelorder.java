class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index=0;
        while(!queue.isEmpty()){
            List<Integer> ls = new ArrayList<Integer>();
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
            if(index%2==1){
                Collections.reverse(ls);
            }
            list.add(ls);
            index++;
        }
        return list;
    }
}
