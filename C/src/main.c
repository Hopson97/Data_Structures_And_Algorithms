#include <stdio.h>
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
    int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
    printf("Testing %s search\n", name);
    int result = function(data, 13, 4);
    printf("Result: %d\n", result);
    doubleNewLine();
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
