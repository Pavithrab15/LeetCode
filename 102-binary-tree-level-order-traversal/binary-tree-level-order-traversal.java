class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if (root == null) {
            return res;
        }
        
        q.offer(root);
        
        while (!q.isEmpty()) {
            int q_size = q.size();
            List<Integer> levelList = new ArrayList<>();
            
            for (int i = 0; i < q_size; i++) {
                TreeNode temp = q.poll();
                levelList.add(temp.val);
                
                if (temp.left != null) {
                    q.add(temp.left);
                }
                
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            
            res.add(levelList);
        }
        
        return res;
    }
}
