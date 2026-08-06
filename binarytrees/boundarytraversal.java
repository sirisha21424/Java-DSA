class Solution {
    public List<Integer> boundary(TreeNode root) {
        //your code goes here
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;
        if (!isLeaf(root))
            ans.add(root.data);

        // 1. Left Boundary
        addLeftBoundary(root, ans);

        // 2. Leaf Nodes
        addLeaves(root, ans);

        // 3. Right Boundary
        addRightBoundary(root, ans);

        return ans;
    }

    // Check whether a node is a leaf
    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    // Add left boundary (excluding leaves)
    private void addLeftBoundary(TreeNode root, ArrayList<Integer> ans) {
        TreeNode curr = root.left;

        while (curr != null) {
            if (!isLeaf(curr))
                ans.add(curr.data);

            if (curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }

    // Add all leaf nodes
    private void addLeaves(TreeNode root, ArrayList<Integer> ans) {
        if (root == null)
            return;

        if (isLeaf(root)) {
            ans.add(root.data);
            return;
        }

        addLeaves(root.left, ans);
        addLeaves(root.right, ans);
    }

    // Add right boundary (excluding leaves) in reverse order
    private void addRightBoundary(TreeNode root, ArrayList<Integer> ans) {
        TreeNode curr = root.right;
        Stack<Integer> stack = new Stack<>();

        while (curr != null) {
            if (!isLeaf(curr))
                stack.push(curr.data);

            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }

        while (!stack.isEmpty()) {
            ans.add(stack.pop());
        }
    }
}
