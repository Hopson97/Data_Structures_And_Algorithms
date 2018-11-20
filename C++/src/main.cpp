#include <iostream>

#include "DataStructures/BinarySearchTree.h"
#include "DataStructures/MaxHeap.h"

int main() {
    MaxHeap<int> heap;
     heap.insert(15);
    heap.insert(10);
    heap.insert(5);
    heap.insert(3);
   
    heap.insert(8);
    heap.insert(1);
    heap.insert(2);
    //heap.insert(0);
    std::cout << "\nBefore Delete:\n";
    heap.print();
    heap.deleteNode(0);
    heap.print();
    return 0;
}