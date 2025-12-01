import java.util.*;
import java.util.Stack;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    static int idx = -1;
    
    // Build tree using preorder traversal pattern
    static Node buildTreePreorder(int[] arr) {
        idx++;
        if (idx >= arr.length || arr[idx] == -1) {
            return null;
        }
        
        Node newNode = new Node(arr[idx]);
        // Preorder: Root -> Left -> Right
        newNode.left = buildTreePreorder(arr);
        newNode.right = buildTreePreorder(arr);
        
        return newNode;
    }
    
    // Build tree using postorder traversal pattern
    static Node buildTreePostorder(int[] arr) {
        idx--;
        if (idx < 0 || arr[idx] == -1) {
            return null;
        }
        
        Node newNode = new Node(arr[idx]);
        // Postorder: Right -> Left -> Root (reverse of postorder)
        newNode.right = buildTreePostorder(arr);
        newNode.left = buildTreePostorder(arr);
        
        return newNode;
    }
    
    // Build tree from level-order (breadth-first) array
    static Node buildTreeLevelOrder(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) return null;
        
        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        
        while (!queue.isEmpty() && i < arr.length) {
            Node current = queue.poll();
            
            // Add left child
            if (i < arr.length && arr[i] != -1) {
                current.left = new Node(arr[i]);
                queue.offer(current.left);
            }
            i++;
            
            // Add right child
            if (i < arr.length && arr[i] != -1) {
                current.right = new Node(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }
        
        return root;
    }
    
    // ===========================================
    // TRAVERSAL METHODS
    // ===========================================
    
    // 1. PREORDER TRAVERSAL (Root -> Left -> Right)
    static void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");  // Visit root
            preorderTraversal(root.left);       // Traverse left
            preorderTraversal(root.right);      // Traverse right
        }
    }
    
    // 2. INORDER TRAVERSAL (Left -> Root -> Right)
    static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);        // Traverse left
            System.out.print(root.data + " ");  // Visit root
            inorderTraversal(root.right);       // Traverse right
        }
    }
    
    // 3. POSTORDER TRAVERSAL (Left -> Right -> Root)
    static void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.left);      // Traverse left
            postorderTraversal(root.right);     // Traverse right
            System.out.print(root.data + " ");  // Visit root
        }
    }
    
    // 4. LEVEL ORDER TRAVERSAL (Breadth-First)
    static void levelOrderTraversal(Node root) {
        if (root == null) return;
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }
    
    // ===========================================
    // ITERATIVE TRAVERSAL METHODS (Using Stacks)
    // ===========================================
    
    // Iterative Preorder
    static void preorderIterative(Node root) {
        if (root == null) return;
        
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.data + " ");
            
            // Push right first, then left (so left is processed first)
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
    }
    
    // Iterative Inorder
    static void inorderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        
        while (current != null || !stack.isEmpty()) {
            // Go to leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            // Process current node
            current = stack.pop();
            System.out.print(current.data + " ");
            
            // Move to right subtree
            current = current.right;
        }
    }
    
    // Iterative Postorder (using two stacks)
    static void postorderIterative(Node root) {
        if (root == null) return;
        
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        
        stack1.push(root);
        
        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);
            
            if (current.left != null) stack1.push(current.left);
            if (current.right != null) stack1.push(current.right);
        }
        
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }
    
    // ===========================================
    // UTILITY METHODS
    // ===========================================
    
    // Print tree structure visually
    static void printTreeStructure(Node root, String prefix, String type) {
        if (root != null) {
            System.out.println(prefix + type + root.data);
            if (root.left != null || root.right != null) {
                printTreeStructure(root.left, prefix + "│   ", "├── ");
                printTreeStructure(root.right, prefix + "│   ", "└── ");
            }
        } else {
            System.out.println(prefix + type + "null");
        }
    }
    
    // Reset index for multiple builds
    static void resetIndex() {
        idx = -1;
    }
}

public class TreeTraversalDemo {
    public static void main(String[] args) {
        // Sample arrays for different construction methods
        int[] preorderArray = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        int[] postorderArray = {-1, -1, 4, -1, -1, 5, 2, -1, -1, 6, -1, -1, 7, 3, 1};
        int[] levelOrderArray = {1, 2, 3, 4, 5, 6, 7, -1, -1, -1, -1, -1, -1, -1, -1};
        
        System.out.println("=".repeat(60));
        System.out.println("BINARY TREE CONSTRUCTION AND TRAVERSAL DEMO");
        System.out.println("=".repeat(60));
        
        // 1. Build tree using preorder pattern
        System.out.println("\n1. BUILDING TREE FROM PREORDER ARRAY:");
        System.out.println("Array: " + Arrays.toString(preorderArray));
        BinaryTree.resetIndex();
        Node preorderRoot = BinaryTree.buildTreePreorder(preorderArray);
        
        System.out.println("\nTree Structure:");
        BinaryTree.printTreeStructure(preorderRoot, "", "Root: ");
        
        // 2. Build tree using level-order pattern
        System.out.println("\n2. BUILDING TREE FROM LEVEL-ORDER ARRAY:");
        System.out.println("Array: " + Arrays.toString(levelOrderArray));
        Node levelOrderRoot = BinaryTree.buildTreeLevelOrder(levelOrderArray);
        
        System.out.println("\nTree Structure:");
        BinaryTree.printTreeStructure(levelOrderRoot, "", "Root: ");
        
        // 3. Demonstrate all traversal methods
        System.out.println("\n" + "=".repeat(60));
        System.out.println("TRAVERSAL METHODS DEMONSTRATION");
        System.out.println("=".repeat(60));
        
        Node root = preorderRoot; // Use preorder built tree for traversals
        
        System.out.println("\nRECURSIVE TRAVERSALS:");
        System.out.println("-".repeat(30));
        
        System.out.print("Preorder  (Root->Left->Right): ");
        BinaryTree.preorderTraversal(root);
        System.out.println();
        
        System.out.print("Inorder   (Left->Root->Right): ");
        BinaryTree.inorderTraversal(root);
        System.out.println();
        
        System.out.print("Postorder (Left->Right->Root): ");
        BinaryTree.postorderTraversal(root);
        System.out.println();
        
        System.out.print("Level Order (Breadth-First):   ");
        BinaryTree.levelOrderTraversal(root);
        System.out.println();
        
        System.out.println("\nITERATIVE TRAVERSALS:");
        System.out.println("-".repeat(30));
        
        System.out.print("Preorder  (Iterative):        ");
        BinaryTree.preorderIterative(root);
        System.out.println();
        
        System.out.print("Inorder   (Iterative):        ");
        BinaryTree.inorderIterative(root);
        System.out.println();
        
        System.out.print("Postorder (Iterative):        ");
        BinaryTree.postorderIterative(root);
        System.out.println();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("TRAVERSAL EXPLANATIONS:");
        System.out.println("=".repeat(60));
        
        System.out.println("\n• PREORDER (Root->Left->Right):");
        System.out.println("  - Process root first, then left subtree, then right subtree");
        System.out.println("  - Used for: Tree copying, expression evaluation");
        
        System.out.println("\n• INORDER (Left->Root->Right):");
        System.out.println("  - Process left subtree, then root, then right subtree");
        System.out.println("  - Used for: Getting sorted order in BST");
        
        System.out.println("\n• POSTORDER (Left->Right->Root):");
        System.out.println("  - Process left subtree, then right subtree, then root");
        System.out.println("  - Used for: Tree deletion, calculating directory sizes");
        
        System.out.println("\n• LEVEL ORDER (Breadth-First):");
        System.out.println("  - Process nodes level by level from top to bottom");
        System.out.println("  - Used for: Finding shortest path, level-wise processing");
    }
}