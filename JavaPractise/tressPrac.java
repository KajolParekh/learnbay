public class tressPrac {
    static class Node {
        int key;
        Node left, right;
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static class BinaryTree {
        //Root of binary tree
        Node root;
        BinaryTree(){
            root = null;
        }

        void printInorder(Node node) { //L root R
            if (node == null) return;

            //first recur on left subtree
            printInorder(node.left);

            //now deal with the key
            System.out.print(node.key + " ");

            //then recur on right subtree
            printInorder(node.right);
        }

        void printPreorder(Node node) { //Root L R
            if (node == null) return;

            //first deal with the key
            System.out.print(node.key + " ");

            //then recur on left subtree
            printPreorder(node.left);

            //now recur on right subtree
            printPreorder(node.right);
        }

        void printPostorder(Node node) {
            if (node == null) return;

            //first recur on left subtree
            printPostorder(node.left);

            //then recur on right subtree
            printPostorder(node.right);

            //now deal with the key
            System.out.print(node.key + " ");
        }
        void printInorder() {printInorder(root);}
        void printPreorder() {printPreorder(root);}
        void printPostorder() {printPostorder(root);}
        //void maxNode() {maxNode(root);}
 
    }
    public static int maxNode(Node node) {
        if (node == null) return Integer.MIN_VALUE;

        int lmax = maxNode(node.left);
        int rmax = maxNode(node.right);

        return Math.max(lmax, Math.max(node.key, rmax));
    }

    public static int minNode(Node node) {
        return (node == null) ? Integer.MAX_VALUE : Math.min(minNode(node.left), Math.min(node.key, minNode(node.right)));
    }

    public static int sumOfNode(Node node) {
        return (node == null) ? 0 : sumOfNode(node.left) + sumOfNode(node.right) + node.key;
    }

    public static boolean findtarget(Node node, int tar) {
        //return (node == null) ? false : (node.key == tar || findtarget(node.left, tar) || findtarget(node.right, tar)) ? true : false;
        
        //base case
        if (node == null) return false;
        if (node.key == tar) return true;
        if (findtarget(node.left,tar)) return true;
        return findtarget(node.right,tar);
    }

    //Find the count of target node
    public static int findAndCountTarget(Node node, int tar) {
        if (node == null) return 0;
        if (node.key == tar) {
            return 1 + findAndCountTarget(node.left, tar) + findAndCountTarget(node.right, tar);
        } else {
            return findAndCountTarget(node.left, tar) + findAndCountTarget(node.right, tar);
        }
    }
    //height of the tree (node based)
    public static int noOfNodes(Node node) {
        if (node == null) return 0;
        return 1 + noOfNodes(node.left) + noOfNodes(node.right);
    }

    //height of the tree (node based)
    public static int heightOfTreesByNodes(Node node) {
        if (node == null) {
            return 0;
        } else {
            // int lh = noOfNodes(node.left);
            // int rh = noOfNodes(node.right);
            // if (lh > rh) {
            //     return lh;
            // } else {
            //     return rh;
            // }

            return 1 + Math.max(noOfNodes(node.left), noOfNodes(node.right));
        }
        
    }

    public static boolean findNodeInBST(Node node, int tar) {
        if (node == null) return false;
        if (node.key == tar) return true;
        if (tar < node.key) {
            return findNodeInBST(node.left, tar);
        } else return findNodeInBST(node.right, tar);
    }

    public static int sumInBST(Node node) {
        return (node == null) ? 0 : sumInBST(node.left) + sumInBST(node.right) + node.key;
    }
    public static int sumOfNodes(Node node) {
        if (node == null) return 0;
        return node.key + sumOfNodes(node.left) + sumOfNodes(node.right);
    }

    public static int findAndCountInBST(Node node, int tar) {
        
        if (node == null) {
            return 0;
        } else if (node.key == tar) {
            return 1;
        } else if (node.key > tar) {
            return findAndCountInBST(node.left, tar);
        } else {
            return findAndCountInBST(node.right, tar);
        }
    }

    public static boolean hasTargetSum(Node node, int targetSum, int currSum) {
        if (node == null) return false; //when tree is empty
        int checkSum = currSum + node.key;

        if (node.left == null && node.right == null && currSum == targetSum) return true; //when tree has no children and root node's data = target sum
        boolean leftSum = hasTargetSum(node.left, targetSum, checkSum);
        if (leftSum) return true;
        boolean rightSum = hasTargetSum(node.right, targetSum, checkSum);
        return leftSum || rightSum;
    }
    public static boolean hasPathSum(Node root, int targetSum) {
        if(root == null) return false;
        // is a leaf node with desired sum value
        if(root.key == targetSum && root.left == null && root.right == null) return true;

        return hasPathSum(root.left, targetSum - root.key) || hasPathSum(root.right, targetSum - root.key); 
    }

    public static int widthOfTree(Node node, int val, boolean leftCheck) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;

        if(leftCheck && node.left != null) {
            val++;
            widthOfTree(node.left, val, true);
        } else {
            if (node.right != null) {
                val++;
                widthOfTree(node.right, val, true);
            }
        }
        return val; 
    }

    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(7);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(5);
        tree.root.left.right.right = new Node(11);
        //tree.root.right.left = new Node(2);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(5);

        // System.out.println("In order travsal ");
        // tree.printInorder();
        // System.out.println();

        // System.out.println("Pre order travsal ");
        // tree.printPreorder();
        // System.out.println();

        // System.out.println("Post order travsal ");
        // tree.printPostorder();
        // System.out.println();

        // System.out.println("Max Node : " + maxNode(tree.root));
        // System.out.println("Min Node : " + minNode(tree.root));
        // System.out.println("Sum : " + sumOfNode(tree.root));
        // System.out.println("Found target Value 3 : " + findtarget(tree.root, 3));
        // System.out.println("Found target Value 8 : " + findtarget(tree.root, 8));
        
        //System.out.println("Count : " + findAndCountTarget(tree.root, 2));

        // System.out.println("No of nodes in tree : " + noOfNodes(tree.root));
        // System.out.println("Height : "+ heightOfTreesByNodes(tree.root));

        // System.out.println("Found target 10 : "+ findNodeInBST(tree.root,20));
        // System.out.println("Sum of node in bST: " + sumInBST(tree.root));
        // System.out.println("Sum: " + sumOfNodes(tree.root));
        //System.out.println("Count of target in BST: " + findAndCountInBST(tree.root, 10));

        // System.out.println("Root to leaf path " + hasTargetSum(tree.root, 21,0));
        // System.out.println(hasPathSum(tree.root, 21));

        int leftSum = widthOfTree(tree.root, 0, true);
        int rightSum = widthOfTree(tree.root, 0, false);
        System.out.println("Sum: "+ (leftSum +rightSum));




        
    }
}


//count leaf nodes in a tree
//check if bst
//program to identify if 2 trees are identical
//LCA - lowest common ancestor (Frequently asked)
//zigzag traversal 
//left view of a binary tree
//