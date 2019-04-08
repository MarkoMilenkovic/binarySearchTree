package service;

import domain.BinaryTree;
import domain.TreeNode;

import java.util.Stack;

public class BinaryTreeService {

    public BinaryTree createTree() {
        BinaryTree tree = new BinaryTree();
        tree.setRoot(new TreeNode("a"));
        tree.getRoot().setLeft(new TreeNode("b"));
        tree.getRoot().getLeft().setLeft(new TreeNode("c"));
        tree.getRoot().getLeft().setRight(new TreeNode("d"));
        tree.getRoot().setRight(new TreeNode("e"));
        tree.getRoot().getRight().setRight(new TreeNode("f"));
        return tree;
    }

    public void printIterative(BinaryTree tree) {
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(tree.getRoot());
        while (!nodes.isEmpty()) {
            TreeNode current = nodes.pop();
            System.out.printf("%s ", current.getData());
            if (current.getRight() != null) {
                nodes.push(current.getRight());
            }
            if (current.getLeft() != null) {
                nodes.push(current.getLeft());
            }
        }
    }

    public void printRecursive(BinaryTree tree) {
        printRecursive(tree.getRoot());
    }

    private void printRecursive(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.printf("%s ", root.getData());
        printRecursive(root.getLeft());
        printRecursive(root.getRight());
    }

}
