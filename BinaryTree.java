public class BinaryTree {
    static class Node{
        int val;
        Node left, right;
        Node(int value){
            this.val = value;
            left = right = null;
        }
    }

    public void insert(Node node, int value){
        if(value < node.val){
            if(node.left!=null){
                insert(node.left, value);
            }
            else{
                node.left = new Node(value);
            }
        }
        else if(value > node.val){
            if(node.right!=null){
                insert(node.right, value);
            }
            else{
                node.right = new Node(value);
            }
        }
    }

    public void inOrder(Node node){
        if(node!=null){
            inOrder(node.left);
            System.out.print(" "+node.val);
            inOrder(node.right);
        }
    }

    public void preOrder(Node node){
        if(node!=null){
            System.out.print(" "+node.val);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node){
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" "+node.val);
        }
    }

    public static void main(String[] args){
        BinaryTree btree = new BinaryTree();
        Node root = new Node(5);
        btree.insert(root, 2);
        btree.insert(root, 4);
        btree.insert(root, 8);
        btree.insert(root, 6);
        btree.insert(root, 7);
        btree.insert(root, 3);
        btree.insert(root, 9);
        btree.inOrder(root);
    }
}
