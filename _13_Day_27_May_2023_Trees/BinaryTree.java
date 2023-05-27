package _13_Day_27_May_2023_Trees;

import java.util.*;

class BuildTree {
    static int index = -1;

    public Node BT(int[] nodes) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }

        Node node = new Node(nodes[index]);
        node.left = BT(nodes);
        node.right = BT(nodes);
        return node;
    }
}

// class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// left = null;
// right = null;
// }
// }

public class BinaryTree {

    public static void printPreorder(Node root) {
        if (root == null) {
            System.out.print("-1 ");
            return;
        }

        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void printPostorder(Node root) {
        if (root == null) {
            System.out.print("-1 ");
            return;
        }

        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void inOrder(Node root) {
        if (root == null) {
            System.out.print("-1 ");
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                if (!q.isEmpty()) {
                    System.out.println();
                    q.add(null);
                } else {
                    break;
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

    public static void main(String[] args) {
        int[] nodes = { 2, 5, 3, 6, -1, -1, 2, -1, -1, 4, -1, -1, 7, -1, 9, -1, 11, -1, -1 };
        BuildTree buildTree = new BuildTree();
        Node node = buildTree.BT(nodes);
        levelOrder(node);

    }
}
