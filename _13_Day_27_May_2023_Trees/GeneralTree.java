package _13_Day_27_May_2023_Trees;

import java.util.*;

class Node {
    int data;
    List<Node> childNodes;

    Node(int data) {
        this.data = data;
        this.childNodes = new ArrayList<>();
    }
}

public class GeneralTree {
    public static void printTreeElement(Node root) {

        // Level Oder traversal :-->
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        Q.add(null);

        while (!Q.isEmpty()) {
            Node currNode = Q.remove();
            if (currNode == null) {
                if (Q.isEmpty()) {
                    break;
                } else {
                    System.out.println();
                    Q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.childNodes.size() != 0) {
                    for (int i = 0; i < currNode.childNodes.size(); i++) {
                        Q.add(currNode.childNodes.get(i));
                    }
                }
            }
        }

        // Traversal via itetrattor :-->
        String str = root.data + " = ";
        for (int i = 0; i < root.childNodes.size(); i++) {
            str += root.childNodes.get(i).data + ", ";
        }

        System.out.println(str);

        for (int i = 0; i < root.childNodes.size(); i++) {
            printTreeElement(root.childNodes.get(i));
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(7);
        Node node5 = new Node(6);
        Node node6 = new Node(9);
        Node node7 = new Node(12);
        Node node8 = new Node(13);
        Node node9 = new Node(17);
        Node node10 = new Node(19);

        node1.childNodes.add(node2);
        node1.childNodes.add(node3);
        node1.childNodes.add(node4);

        node2.childNodes.add(node5);
        node2.childNodes.add(node6);

        node4.childNodes.add(node7);
        node4.childNodes.add(node8);
        node4.childNodes.add(node9);
        node4.childNodes.add(node10);

        printTreeElement(node1);
    }
}
