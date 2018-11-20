#include "util.h"

#include <stdio.h>

void swap(int* a, int* b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

void printArray(int data[], int n)
{
    for (int i = 0; i < n; i++) {
        printf("%d\n", data[i]);
    }
}

void doubleNewLine() 
{
    printf("\n\n");
}