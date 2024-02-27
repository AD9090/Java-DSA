package dsa.ad;

public class Trees {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    public static class BinaryTree{
        static int indx=-1;
        static Node BuildTree( int [] nodes ){
            indx++;

            if(nodes[indx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[indx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
        }

        static void preOrder(Node root){
            if(root==null){
                return;
            }
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        System.out.println(root.data);
    }
}
