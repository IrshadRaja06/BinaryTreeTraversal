
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}

class Order {
    TreeNode root;

    public void InOrder(TreeNode root) {
        if (root == null)
            return;
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public void preOrder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}

class Order2 extends Order{
    TreeNode root;
}



public class BinaryTree {
    public static void main(String[] args) {
        Order l = new Order();
        Order2 l1 = new Order2();

        l.root = new TreeNode(1);
        l.root.left = new TreeNode(2);
        l.root.right = new TreeNode(3);
        l.root.left.left = new TreeNode(4);
        l.root.left.right = new TreeNode(5);
        l.root.right.left = new TreeNode(6);
        l.root.right.right = new TreeNode(7);
        l.root.left.right.left = new TreeNode(8);
        l.root.right.right.left = new TreeNode(9);
        l.root.right.right.right = new TreeNode(10);


        l1.root = new TreeNode(4);
        l1.root.left = new TreeNode(2);
        l1.root.left.left = new TreeNode(3);
        l1.root.left.left.right = new TreeNode(9);
        l1.root.left.left.right.left = new TreeNode(1);
        l1.root.right = new TreeNode(5);
        l1.root.right.left = new TreeNode(7);
        l1.root.right.right = new TreeNode(6);
        l1.root.right.right.left = new TreeNode(8);

       System.out.println("1st Input answer:");
        System.out.println("\nInoder Traversal:");
        l.InOrder(l.root);
        System.out.println("\npreoder Traversal:");
        l.preOrder(l.root);
        System.out.println("\npostoder Traversal:");
        l.postOrder(l.root);
-
        System.err.println("\n\n2nd Input answer:");
        System.out.println("\nInoder Traversal:");
        l1.InOrder(l1.root);
        System.out.println("\npreoder Traversal:");
        l1.preOrder(l1.root);
        System.out.println("\npostoder Traversal:");
        l1.postOrder(l1.root);

    }
}