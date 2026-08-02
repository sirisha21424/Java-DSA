class Solution {
    public List<Integer> postorder(TreeNode root) {
        //your code goes here
      List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        TreeNode lastVisited = null;

        while (curr != null || !stack.isEmpty()) {

            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            TreeNode temp = stack.peek();
            if (temp.right != null && lastVisited != temp.right) {
                curr = temp.right;
            } 
            else {
                ans.add(temp.data);
                lastVisited = temp;
                stack.pop();
            }
        }

        return ans;

    }
}