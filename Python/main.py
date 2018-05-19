import sort_algorithms as Sort
import search_algorithms as Search

if __name__ == "__main__":
    data = [5, 2, 3, 7, 8, 4, 1, 9, 6]

    Sort.insertion_sort(data)

    print(Search.binary_search(data, 2))