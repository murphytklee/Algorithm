import java.io.*;

public class Main {

    static class Node {
        char value;
        Node left, right;

        Node(char value) {
            this.value = value;
        }
    }

    static Node root;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        root = new Node('A');

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            char root = input[0].charAt(0);
            char left = input[1].charAt(0);
            char right = input[2].charAt(0);

            insertNode(root, left, right);
        }

        sb = new StringBuilder();
        preOrder(root);
        sb.append('\n');
        inOrder(root);
        sb.append('\n');
        postOrder(root);
        sb.append('\n');

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void insertNode(char rootValue, char leftValue, char rightValue) {
        Node currentNode = findNode(root, rootValue);
        if (leftValue != '.') currentNode.left = new Node(leftValue);
        if (rightValue != '.') currentNode.right = new Node(rightValue);
    }

    public static Node findNode(Node current, char value) {
        if (current == null) return null;
        if (current.value == value) return current;

        Node left = findNode(current.left, value);
        if (left != null) return left;

        return findNode(current.right, value);
    }

    private static void preOrder(Node node) {
        if (node == null) return;
        sb.append(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    private static void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        sb.append(node.value);
        inOrder(node.right);
    }

    private static void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        sb.append(node.value);
    }
}
