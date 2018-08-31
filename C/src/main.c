#include <stdio.h>
#include <stdlib.h>
#include "util.h"
#include "algorithm/sort.h"
#include "algorithm/search.h"

void testBubbleSort() 
{
    int data[] = { 5, 2, 3, 7, 8, 4, 1, 9, 6 };
    printf("Testing bubble sort\n");
    bubbleSort(data, 9);
    printArray(data, 9);
    doubleNewLine();
}

void testSearch(SearchFunction function, const char* name) 
{
    int n = 1000;
    int* data = malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) data[i] = i;

    printf("Testing %s search\n", name);
    int result = function(data, n, 993);
    printf("Result: %d\n", result);
    doubleNewLine();

    free(data);
}

int main()
{
    printf("\n\nDSA IN C\n\n");
    testBubbleSort();

    testSearch(&linearSearch, "linear");
    testSearch(&binarySearchItr, "Binary Iterative");

    //testLinearSearch();
    //testBinarySearch();
// Visual studio auto-closes exe on end, 
// this will pause that so you can view output
#ifdef __WIN32
    printf("Press enter to end\n");
    getchar();
#endif
    return 0;
}
