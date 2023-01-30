class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> arr = new ArrayList<Integer>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        return sortedBST(arr,0,arr.size()-1);
    }
    TreeNode sortedBST(List<Integer> list,int left,int right){
        if(left>right)
            return null;
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = sortedBST(list,left,mid-1);
        root.right = sortedBST(list,mid+1,right);
        return root;
    }
        
    
}
