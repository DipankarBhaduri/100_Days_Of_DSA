package _01_Day_15_May_2023;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;

    public ListNode addLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return head;
        }

        ListNode curListNode = head;
        while (curListNode.next != null) {
            curListNode = curListNode.next;
        }

        curListNode.next = newNode;
        return head;
    }

    public void printListNode(ListNode L1) {
        while (L1 != null) {
            System.out.print(L1.val + " ");
            L1 = L1.next;
        }
        System.out.println();
    }
}

public class Add_Two_Numbers {
    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();
        ListNode root = null;
        root = L1.addLast(2);
        root = L1.addLast(4);
        root = L1.addLast(3);

        ListNode root2 = null;
        LinkedList L2 = new LinkedList();
        root2 = L2.addLast(5);
        root2 = L2.addLast(6);
        root2 = L2.addLast(4);

        Add_Two_Numbers1 add_Two_Numbers1 = new Add_Two_Numbers1();
        ListNode ans = add_Two_Numbers1.addTwoNumbers(root, root2);
        L2.printListNode(ans);
    }
}

class Add_Two_Numbers1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lNode = new ListNode(0);
        ListNode Dummy = lNode;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;

            carry = sum / 10;
            ListNode nnode = new ListNode(sum % 10);
            lNode.next = nnode;
            lNode = lNode.next;
        }

        return Dummy.next;
    }
}