package datastructures;

/**
 *
 * @author mhops
 * @param <T> The data type for the linked list to hold
 */
public class LinkedList<T>
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
    
    public LinkedList() 
    { }
    
    public void add(T data)
    {
        Node newNode = new Node(data);
        if (m_size == 0) {
            m_begin = newNode;
            m_end = newNode;
        }
        else {
            newNode.before = m_end;
            m_end.next = newNode;
            m_end = newNode;
        }
        
        m_size++;
    }
    
    public void addFront(T data) 
    {
        Node newNode = new Node(data);
        if (m_size == 0) {
            m_begin = newNode;
            m_end = newNode;
        }
        else {
            newNode.next = m_begin;
            m_begin.before = newNode;
            m_begin = newNode;
        }
        
        m_size++;
    }
    
    public T get(int index) 
    {
        Node itr = m_begin;
        for (int i = 0; i < index; i++) {
            itr = itr.next;
        }
        return itr.data;
    }
    
}
