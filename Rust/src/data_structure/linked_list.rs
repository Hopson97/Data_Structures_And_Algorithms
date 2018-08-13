use std::ptr;

pub struct LinkedList<T> {
    first: Option<Box<Node<T>>>,
    end: *const Node<T>,
    size: u32
}

struct Node<T> {
    pub next: *const Node<T>,
    pub prev: *const Node<T>,
    pub data: T
}

impl<T: Clone> LinkedList<T> {
    fn new() -> LinkedList<T>{
        LinkedList {
            first: None,
            end: ptr::null(),
            size: 0
        }
    }

    fn push(&mut self, data: &T) {
        if self.size == 0 {
            self.first = Some(Box::new(Node::new(data)));

        }
    }
}

impl<T: Clone> Node<T> {
    fn new(data: &T) -> Node<T> {
        Node {
            next: ptr::null(),
            prev: ptr::null(),
            data: data.clone()
        }
    }
}