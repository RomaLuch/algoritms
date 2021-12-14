package solutions;

public class TreeNodeSum {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class SolutionOne {
        public boolean findTarget(TreeNode root, int k) {
            if (root == null) {
                return false;
            }
            int second = k - root.val;
            if (second > root.val) {
                return findSecond(root.right, second);
            } else {
                return findSecond(root.left, second);
            }
        }

        private void graphMove(TreeNode root) {
            if (root == null) {
                return;
            }
            graphMove(root.right);
            graphMove(root.left);
        }

        private boolean findSecond(TreeNode node, int target) {
            if (node == null) {
                return false;
            }
            int val = node.val;
            if (val == target) {
                return true;
            } else if (target > val) {
                findSecond(node.right, target);
            } else {
                findSecond(node.left, target);
            }
            return false;
        }
    }
}
