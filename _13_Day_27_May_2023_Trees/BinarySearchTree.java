package _13_Day_27_May_2023_Trees;

import java.util.*;

// class Node {
//     int data;
//     Node left;
//     Node right;

//     Node(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

class BuildBinaryTree {
    public Node BST(Node root, int val) {
        Node node = null;
        if (root == null) {
            node = new Node(val);
            return node;
        }

        if (root.data < val) {
            root.right = BST(root.right, val);
        } else if (root.data > val) {
            root.left = BST(root.left, val);
        }
        return root;
    }

    public void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node currNode = queue.remove();
            if (currNode == null) {
                if (queue.isEmpty()) {
                    break;
                } else {
                    System.out.println();
                    queue.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BuildBinaryTree buildBinaryTree = new BuildBinaryTree();
        int[] nodes = { 7, 5, 4, 2, 3, 6, 9, 8, 11, 10, 12 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = buildBinaryTree.BST(root, nodes[i]);
        }
        buildBinaryTree.postOrder(root);
    }
}
