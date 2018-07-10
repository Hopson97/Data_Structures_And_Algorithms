

pub struct LinkedList<T> {
    first: Option<Box<Node<T>>>,
    end: Option<Box<Node<T>>>,
    size: u32
}

struct Node<T> {
    pub next: *mut Node<T>,
    pub prev: *mut Node<T>,
    pub data: T
}

impl<T> LinkedList<T> {
    fn new() -> LinkedList<T>{
        LinkedList {
            first: None,
            end: None,
            size: 0
        }
    }

    fn push(&mut self, data: &T) {

    }
}