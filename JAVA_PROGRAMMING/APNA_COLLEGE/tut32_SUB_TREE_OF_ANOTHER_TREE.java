public class tut32_SUB_TREE_OF_ANOTHER_TREE {
    class treeNode {
        int val;
        treeNode left;
        treeNode right;

        treeNode() {
        }

        treeNode(int val) {
            this.val = val;
        }

        treeNode(int val, treeNode right, treeNode left) {
            this.val = val;
            this.right = right;
            this.left = left;
        }
    }

    class solution {
        public boolean isIdentical(treeNode root, treeNode subRoot) {
            if (root == null && subRoot == null) {
                return true;
            }
            if (root == null || subRoot == null) {
                return false;
            }

            if (root.val == subRoot.val) {
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }
            return false;
        }

        public boolean isSubtree(treeNode root, treeNode subRoot) {
            if (subRoot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (root.val == subRoot.val) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

}
