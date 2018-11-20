#pragma once

#include <iostream>

template <typename T>
class BinarySearchTree {
    struct BSTNode {
        T data;
        BSTNode* left = nullptr;
        BSTNode* right = nullptr;
    };

    public:
        BinarySearchTree() {

        }

        ~BinarySearchTree() {
            
        }

        void insert(T data) {
            if (m_size == 0) {
                m_rootNode = new BSTNode();
                m_rootNode->data = data;
                std::cout << "Root node created\n";
            }
            else {
                auto newLeaf = makeLeaf(data, m_rootNode);
                newLeaf->data = data;
                std::cout << "Non-root node created with value: " << data << std::endl;
            }
            m_size++;
        }

        template<typename F> 
        void nodeForEach(F function) {
            nodeForEach(m_rootNode, function);
        }

    private:
        BSTNode* makeLeaf(T data, BSTNode* node) {
            if (node == nullptr) {
                return new BSTNode();
            }

            if (data < node->data) {
                return makeLeaf(data, node->left);
            }
            else {
                return makeLeaf(data, node->right);
            }
        }

        BSTNode* m_rootNode = nullptr;
        size_t m_size = 0;
};