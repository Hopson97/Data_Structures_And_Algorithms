package dsa.datastructures;

import org.junit.Test;
import static org.junit.Assert.*;


public class BinarySearchTreeTest {
    @Test
    public void testAdd() {
        MyBinarySearchTree tree = new MyBinarySearchTree();

        tree.add(10, "Hello");
        tree.add(5, "World");
        tree.add(15, "Foo");
        tree.add(20, "Bar");
        assertEquals("Foo", tree.find(15));
    }

}