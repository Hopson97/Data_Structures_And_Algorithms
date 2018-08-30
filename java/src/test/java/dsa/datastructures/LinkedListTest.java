package dsa.datastructures;

import org.junit.Test;
import static org.junit.Assert.*;


public class LinkedListTest {
    @Test
    public void testAdd() {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.add(5);
        ll.add(7);
        assertEquals(Integer.valueOf(7), ll.get(1));
        System.out.print("TEST");
    }

    @Test
    public void testRemove() {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.add(5);
        ll.add(6);
        ll.add(7);

        ll.erase(1);

        assertEquals(Integer.valueOf(7), ll.get(1));
        System.out.print("TEST"); 
    }

    @Test
    public void testInsert() {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        for (int i = 0; i < 100; i++) {
            ll.add(i);
        }
        ll.insert(47, 500);
        assertEquals(Integer.valueOf(500), ll.get(47));
    }
}