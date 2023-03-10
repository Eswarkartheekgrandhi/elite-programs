class Solution {
    int count=0;
    void inOrder(TreeNode root,List<Integer>list)
    {
        if(root==null)
            return ;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer>list=new LinkedList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        inOrder(root,list);
        for(int i=0;i<list.size();i++){
            int sum=k-list.get(i);
            if(map.containsKey(sum))
            {
                return true;
            }
            else
                map.put(list.get(i),i);
        }
        return false;
    }
}
