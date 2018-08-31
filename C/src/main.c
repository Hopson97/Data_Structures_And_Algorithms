#include <stdio.h>
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

void testLinearSearch() 
{
    int data[] = { 5, 2, 3, 7, 8, 4, 1, 9, 6 };
    printf("Testing linear search\n");
    int index = linearSearch(data, 9, 3);
    printf("Found index: %d\n", index);
    doubleNewLine();
}
    

int main()
{
    printf("\n\nDSA IN C\n\n");
    testBubbleSort();
    testLinearSearch();
// Visual studio auto-closes exe on end, 
// this will pause that so you can view output
#ifdef __WIN32
    printf("Press enter to end\n");
    getchar();
#endif
    return 0;
}
