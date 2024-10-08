/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>s=new ArrayList<>();
        if(root==null){
            return s;
        }
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp=st.peek();
            st.pop();
            s.add(temp.val);
            if(temp.right!=null){
                st.push(temp.right);

            }
            if(temp.left!=null){
                st.push(temp.left);

            }
        }
        return s;
    }
}