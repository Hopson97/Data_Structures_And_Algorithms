#include "search.h"

#include <stdio.h>

int linearSearch(int* data, int n, int searhFor) 
{
    for (int i = 0; i < n; i++) {
        if (data[i] == searhFor) return i;
    }
    return -1;
} 

int binarySearchItr(int* data, int n, int searhFor) 
{
    int min = 0;
    int max = n;
    int pivot = (min + max) / 2;
    while (min != max) {
        int value = data[pivot];
        printf("Binary Search: Looking at value: %d %d %d\n", value, min, max);
        if (value == searhFor) {
            return 1;
        }
        else {
            if (value > searhFor) {
                max = (pivot + max) / 2;
                pivot = (min + max) / 2;
            }
            else {
                min = pivot;
                pivot = (min + max) / 2;
            }
        }
    }
    return 0;
}
