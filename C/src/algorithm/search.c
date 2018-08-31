#include "search.h"

int linearSearch(int* data, int n, int searhFor) 
{
    for (int i = 0; i < n; i++) {
        if (data[i] == searhFor) return i;
    }
    return -1;
} 