package dev.nvtruong.oop.avl;

import java.util.ArrayList;
import java.util.List;

public final class StudentAvlTree {
    static final class Node {
        StudentRecord data;
        Node left;
        Node right;
        int height = 1;

        Node(StudentRecord data) { this.data = data; }
    }

    private Node root;
    private int size;

    public int size() { return size; }

    public boolean insert(StudentRecord record) {
        if (contains(record.id())) return false;
        root = insert(root, record);
        size++;
        return true;
    }

    public StudentRecord search(int id) {
        Node node = root;
        while (node != null) {
            if (id == node.data.id()) return node.data;
            node = id < node.data.id() ? node.left : node.right;
        }
        return null;
    }

    public boolean contains(int id) { return search(id) != null; }

    public boolean delete(int id) {
        if (!contains(id)) return false;
        root = delete(root, id);
        size--;
        return true;
    }

    public List<StudentRecord> preOrder() {
        List<StudentRecord> result = new ArrayList<>();
        preOrder(root, result);
        return List.copyOf(result);
    }

    public List<StudentRecord> inOrder() {
        List<StudentRecord> result = new ArrayList<>();
        inOrder(root, result);
        return List.copyOf(result);
    }

    public boolean isBalanced() { return isBalanced(root); }

    private Node insert(Node node, StudentRecord record) {
        if (node == null) return new Node(record);
        if (record.id() < node.data.id()) node.left = insert(node.left, record);
        else node.right = insert(node.right, record);
        return rebalance(node);
    }

    private Node delete(Node node, int id) {
        if (node == null) return null;
        if (id < node.data.id()) node.left = delete(node.left, id);
        else if (id > node.data.id()) node.right = delete(node.right, id);
        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            Node successor = min(node.right);
            node.data = successor.data;
            node.right = delete(node.right, successor.data.id());
        }
        return rebalance(node);
    }

    private Node min(Node node) {
        while (node.left != null) node = node.left;
        return node;
    }

    private Node rebalance(Node node) {
        updateHeight(node);
        int balance = balanceFactor(node);

        if (balance > 1) {
            if (balanceFactor(node.left) < 0) node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balance < -1) {
            if (balanceFactor(node.right) > 0) node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node middle = y.left;
        y.left = x;
        x.right = middle;
        updateHeight(x);
        updateHeight(y);
        return y;
    }

    private Node rotateRight(Node y) {
        Node x = y.left;
        Node middle = x.right;
        x.right = y;
        y.left = middle;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private int height(Node node) { return node == null ? 0 : node.height; }
    private int balanceFactor(Node node) { return node == null ? 0 : height(node.left) - height(node.right); }

    private void updateHeight(Node node) {
        node.height = 1 + Math.max(height(node.left), height(node.right));
    }

    private void preOrder(Node node, List<StudentRecord> out) {
        if (node == null) return;
        out.add(node.data);
        preOrder(node.left, out);
        preOrder(node.right, out);
    }

    private void inOrder(Node node, List<StudentRecord> out) {
        if (node == null) return;
        inOrder(node.left, out);
        out.add(node.data);
        inOrder(node.right, out);
    }

    private boolean isBalanced(Node node) {
        if (node == null) return true;
        return Math.abs(balanceFactor(node)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }
}
