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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();

        if(root==null) return l;

        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> li=new ArrayList<>();

            for(int i=0; i<n; i++){
                TreeNode de=q.poll();

                if(de.left!=null) q.offer(de.left);
                if(de.right!=null) q.offer(de.right);

                li.add(de.val);
            }

            l.add(li.get(n-1));
        }

        return l;
    }
}
