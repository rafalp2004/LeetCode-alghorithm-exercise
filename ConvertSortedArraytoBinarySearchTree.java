public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return constructBST(nums, 0, nums.length-1);
    }
    public TreeNode constructBST(int[] nums, int left, int right){
        if(left>right) return null;
        int midElement = left + (right - left) /2;
        TreeNode node = new TreeNode(nums[midElement]);

        node.left = constructBST(nums, left, midElement-1);
        node.right = constructBST(nums, midElement+1, right);


        return node;
    }
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
}
