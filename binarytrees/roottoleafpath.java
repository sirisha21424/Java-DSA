class Solution {
    public List<List<Integer>> allRootToLeaf(TreeNode root) {
        //your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, path, ans);

        return ans;

    }
    private void dfs(TreeNode node, List<Integer> path, List<List<Integer>> ans) {

        if (node == null)
            return;

        // Choose
        path.add(node.data);
        if (node.left == null && node.right == null) {
            ans.add(new ArrayList<>(path));   
        } else {
            // Explore
            dfs(node.left, path, ans);
            dfs(node.right, path, ans);
        }
        path.remove(path.size() - 1);
    }
}


