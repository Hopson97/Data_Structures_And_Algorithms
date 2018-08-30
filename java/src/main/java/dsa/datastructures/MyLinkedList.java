package dsa.datastructures;

/**
 *
 * @author mhops
 * @param <T> The data type for the linked list to hold
 */
public class MyLinkedList<T>
{
    class Node 
    {
        public T data;
        public Node next = null;
        public Node before = null;
        
        public Node(T data) 
        {
            this.data = data;
        }
    }
    
    Node m_begin = null;
    Node m_end = null;
    int m_size = 0;
    
    public MyLinkedList() 
    { }
    
    /**
     * Replaces a node by putting a new node before it, thus inserting it.
     * For the end node, it adds it after; as the last node is seen as a null.
     * @param replacee The node to replace a new node with/ insert the new node before
     * @param data The data to add to the list
     */
    private void insert(Node replacee, T data) {
        Node newNode = new Node(data);
        newNode.before = replacee != null ? replacee.before : m_end;
        newNode.next   = replacee;
        
        if (newNode.before != null) newNode.before.next = newNode;
        if (replacee != null)       replacee.before = newNode;
        
        if (replacee == m_begin) m_begin = newNode;
        if (replacee == null)    m_end = newNode;
        
         m_size++;
    }
    
    private void erase(Node toErase) {
        if (toErase.before != null) {
            toErase.before.next = toErase.next;
        }
        if (toErase.next != null) {
            toErase.next.before = toErase.before;
        }
        if (toErase == m_end)    m_end = toErase.before;
        if (toErase == m_begin)  m_end = toErase.next;
        
        m_size--;
    }
    
    private Node getNode(int index) {
        Node itr = m_begin;
        for (int i = 0; i < index; i++) {
            itr = itr.next;
        }
        return itr;
    }
    
    public void erase(int index) {
        erase(getNode(index));
    }
    
    public void add(T data) {
        insert(null, data);
    }
    
    public void addFront(T data) {
        insert(m_begin, data);
    }
    
    public void insert(int index, T data) {
        insert(getNode(index), data);
    }
    
    public T get(int index) {
        return getNode(index).data;
    }
    
    public int size() {
        return m_size;
    }
    
}
