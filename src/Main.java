import domain.BinaryTree;
import service.BinaryTreeService;

public class Main {

    public static void main(String[] args) {
        BinaryTreeService treeService = new BinaryTreeService();
        BinaryTree binaryTree = treeService.createTree();
        treeService.printIterative(binaryTree);
        System.out.println("\n");
        treeService.printRecursive(binaryTree);
    }

}
