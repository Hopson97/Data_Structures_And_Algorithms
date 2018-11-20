#pragma once

#include <vector>
#include <algorithm>
#include <iostream>
#include <optional>

template <typename T>
class MaxHeap {
    using Opt = std::optional<T>;
    public:
        public:
            MaxHeap() {}
            MaxHeap(size_t capacity) {
                m_heap.reserve(capacity);
            }

            void insert(const T& value) {
                auto insertIndex = m_heap.size() + 1;
                m_heap.push_back(value);

                auto parentIndex = (int)(insertIndex / 2);
                bubbleUp(insertIndex, parentIndex);
            }


            void bubbleUp(size_t insert, size_t parent) {
               // print();
                if (m_heap[insert] > m_heap[parent]) {
                    std::swap(m_heap[insert], m_heap[parent]);
                    bubbleUp(parent, parent / 2);
                }
            }

            void deleteNode(size_t index) {
                std::swap(m_heap[index], m_heap[m_heap.size() - 1]);
                m_heap.pop_back();

                bubbleDown(index + 1);
            }

            void bubbleDown(size_t index) {
                auto cAIndex = index * 2 - 1;
                auto cBIndex = cAIndex + 1;
                auto maximum = m_heap.size() - 1;

                auto maxIndex = [&]() {
                    if (std::min(cAIndex, cBIndex) > maximum) {
                        return Opt();
                    }
                    if (m_heap[cAIndex] > m_heap[cBIndex]) {
                        return Opt(cAIndex);
                    }
                    return Opt(cBIndex);
                }();
                if (maxIndex) {
                    if (m_heap[index - 1] < m_heap[*maxIndex]) {
                        std::swap(m_heap[index - 1], m_heap[*maxIndex]);
                        bubbleDown(*maxIndex + 1);
                    }
                }
            }

    void print() {
        for (auto& n : m_heap) {
            std::cout << n << ' ';
        }
        std::cout << '\n';
    }
    private:
        std::vector<T> m_heap;
};