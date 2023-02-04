class Solution {
    class queueObj{
        TreeNode node;
        int lev;
        queueObj(TreeNode node,int val){
            this.node=node;
            lev=val;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<queueObj> q = new LinkedList<>();
        if(root==null) return 0;
        q.offer(new queueObj(root,0));
        int maxw=0;
        while(!q.isEmpty()){
            int len = q.size();
            int fi=0;
            int last=0;
            for(int i=0;i<len;i++)
            {
                queueObj curr=q.remove();
                TreeNode node=curr.node;
                int id=curr.lev;
                if(i==0)
                    fi=id;
                if(i==len-1)
                    last=id;
                if(node.left!=null){
                    q.add(new queueObj(node.left,2*id+1));
                }
                if(node.right!=null){
                    q.add(new queueObj(node.right,2*id+2));
                }
            }
            maxw=Math.max(maxw,last-fi+1);
        }
        return maxw;
    }
}
