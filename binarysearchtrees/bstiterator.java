
class BSTIterator {
        List<Integer> list=new ArrayList<>();
        int pointer=-1;
        public BSTIterator(TreeNode root) {
            inorder(root);
           
        }

        public boolean hasNext() {
            return pointer+1<list.size();
            
        }

        public int next() {
            pointer++;
            return list.get(pointer);
            
        }
        public void inorder(TreeNode root)
        {   if(root == null)
            return;

            inorder(root.left);
            list.add(root.data);
            inorder(root.right);
        }
}