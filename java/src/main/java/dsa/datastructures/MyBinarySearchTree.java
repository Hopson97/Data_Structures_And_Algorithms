package dsa.datastructures;

public class MyBinarySearchTree {
    private class Node {
        public NodePointer left;
        public NodePointer right;
        public int key;
        public String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
            this.left = new NodePointer();
            this.right =  new NodePointer();
        }
    }
    private class NodePointer {
        Node node;
    }

    private NodePointer root;
    private int size;

    public MyBinarySearchTree() {
        root = new NodePointer();
        size = 0;
    }

    public void add(int key, String value) {
        if (root.node == null) {
            System.out.println("INSERTING ROOT");
            root.node = new Node(key, value);
            size++;
            return;
        }
        System.out.println("INSERTING NON-ROOT");
        addLeaf(root, key, value);
        size++;
    }
    

    public String find(int key) {
        NodePointer nodeptr = find(root, key);
        if (nodeptr.node != null) {
            return nodeptr.node.value;
        } 
        return  "FAIL";
    }

    public void print() {
        System.out.println("=========");
        System.out.println("PRINTING TREE");
        depthFirstTraversal(root);
    }

    private void depthFirstTraversal(NodePointer root) {
        if (root.node == null) return;
        
        System.out.printf("Key: %d Value: %s\n", root.node.key, root.node.value);
        depthFirstTraversal(root.node.left);
        depthFirstTraversal(root.node.right);
    }

    private NodePointer find(NodePointer nodeptr, int key) {
        if (nodeptr.node == null) {
            System.out.println("Find: Failed");
            return null;
        }
        if (nodeptr.node.key == key) {
            System.out.println("Find: Found");
            return nodeptr;
        }
        else if (key >= nodeptr.node.key) {
            System.out.println("Find: Going right " + nodeptr.node.value + " " + nodeptr.node.key);
            return find(nodeptr.node.right, key);
        }
        else {
            System.out.println("Find: Going left " + nodeptr.node.value + " " + nodeptr.node.key);
            return find(nodeptr.node.left, key);
        }
    }


    private void addLeaf(NodePointer nodeptr, int key, String value) {
        if (nodeptr.node == null) {
            nodeptr.node = new Node(key, value);
        }
        else if (key  >= nodeptr.node.key) {
            System.out.println("Add: Going right");
            addLeaf(nodeptr.node.right, key, value);
        } else {
            System.out.println("Add: Going left");
            addLeaf(nodeptr.node.left, key, value);
        }
    }
}