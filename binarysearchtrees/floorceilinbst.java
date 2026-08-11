import java.util.*;
class Solution {
    public List<Integer> floorCeilOfBST(TreeNode root, int key) {
        //your code goes here
        int floor=-1;
        int ceil=-1;
        List<Integer> list=new ArrayList<>();
        TreeNode temp = root;

        while (temp != null) {

            if (temp.data == key) {
                floor = temp.data;
                break;
            }

            if (temp.data > key) {
                temp = temp.left;
            } 
            else {
                floor = temp.data;
                temp = temp.right;
            }
        }

        // Find Ceil
        temp = root;

        while (temp != null) {

            if (temp.data == key) {
                ceil = temp.data;
                break;
            }

            if (temp.data < key) {
                temp = temp.right;
            } 
            else {
                ceil = temp.data;
                temp = temp.left;
            }
        }

        list.add(floor);
        list.add(ceil);

        return list;

        
    }
}