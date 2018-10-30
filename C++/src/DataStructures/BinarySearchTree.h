#pragma once
#include <memory>

template <typename T>
class BinarySearchTree {
    struct BSTNode {
        T data;
        std::unique_ptr<BSTNode> left = nullptr;
        std::unique_ptr<BSTNode> right = nullptr;
    };

    public:
        void insert(T data) {
            if (m_size == 0) {
                m_rootNode = std::make_unique<BSTNode>();
                m_size++;
            }
            else {

            }
        }

    private:
        std::unique_ptr<BSTNode> m_rootNode = nullptr;
        size_t m_size = 0;
};