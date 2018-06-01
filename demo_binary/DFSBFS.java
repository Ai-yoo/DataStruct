package test.binary;

import java.util.*;

/**
 * Created with IDEA
 *
 * DFS深度优先遍历二叉树
 * BFS广度优先遍历二叉树
 *         1
 *       /   \
 *      2     3
 *     / \   / \
 *    4   5 6   7
 *   /
 *  8
 * @author duzhentong
 * @Date 2018/6/1
 * @Time 9:21
 */
public class DFSBFS {
    public static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value, Node left, Node right) {
            this.left = left;
            this.right = right;
            this.value = value;
        }

    }

    public static void main(String[] args) {
        Node n8 = new Node(8, null, null);
        Node n7 = new Node(7, null, null);
        Node n6 = new Node(6, null, null);
        Node n5 = new Node(5, null, null);
        Node n4 = new Node(4, n8, null);
        Node n3 = new Node(3, n6, n7);
        Node n2 = new Node(2, n4, n5);
        Node n1 = new Node(1, n2, n3);
        binartDFS(n1);
        System.out.println("+--------------+");
        binaryBFS(n1);
    }

    //深度优先遍历
    public static void binartDFS(Node head) {
        if (head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.println(curr.value);
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }

    //广度优先
    public static void binaryBFS(Node head) {
        if (head == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.println(curr.value);
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }
}
