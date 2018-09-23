package dsa;

import dsa.datastructures.MyBinarySearchTree;

/**
 *
 * @author mhops
 */
public class Main {
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.println(val);
        }
    }
    
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();

        tree.add(10, "Hello");
        tree.add(5, "World");
        tree.add(15, "Foo");
        tree.add(20, "Bar");
        tree.add(17, "swag");
        tree.add(-10, "-10");

        String x = tree.find(17);
        System.out.println(x);
    }
}
