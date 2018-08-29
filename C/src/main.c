#include <stdio.h>
#include "algorithm/sort.h"

void printArray(int data[], int n)
{
    for (int i = 0; i < n; i++) {
        printf("%d\n", data[i]);
    }
}


int main()
{
    int data[] = { 5, 2, 3, 7, 8, 4, 1, 9, 6 };
    bubbleSort(data, 9);
    printArray(data, 9);

    printf("Press enter to end\n");
    getchar();
    return 0;
}
