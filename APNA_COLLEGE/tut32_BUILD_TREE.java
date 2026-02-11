import java.util.*;

public class tut32_BUILD_TREE {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class binaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // ---------------------- Pre-Order Traversal -----------------------
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // ---------------------- In-Order Traversal -----------------------
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // ---------------------- Post-Order Traversal -----------------------
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // ---------------------- Level-Order Traversal -----------------------
    public static void levelOrder(Node root) {
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // ---------------------- Count Of Nodes -----------------------
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    // ---------------------- Sum Of Nodes -----------------------
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);
        return leftsum + rightsum + root.data;
    }

    // ---------------------- Height Of Tree -----------------------
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;

        return myHeight;
    }

    // ---------------------- Diameter Of the Tree -----------------------

    // Trick - 1:
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) + 1;

        return Math.max(dia3, Math.max(dia1, dia2));
    }

    // Trick - 2:
    static class treeInfo {
        int ht;
        int diam;

        treeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static treeInfo diameter2(Node root){
        if(root == null){
            return new treeInfo(0,0);
        }

        treeInfo left = diameter2(root.left);
        treeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        treeInfo myInfo = new treeInfo(myHeight, mydiam);
        return myInfo; 
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println("The Count of Nodes: "+countOfNodes(root));
        System.out.println("The Sum of Nodes: "+sumOfNodes(root));
        System.out.println("The Height of Tree: "+height(root));
        System.out.println("The Diameter of Tree: "+diameter(root));
        System.out.println("The Diameter of Tree: "+diameter2(root).diam);
    }
}
